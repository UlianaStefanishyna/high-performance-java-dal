package com.exercises.hibernate.util.service.impl;

import com.exercises.exception.DaoException;
import com.exercises.hibernate.util.service.OperationWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.function.Consumer;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class OperationWrapperImpl implements OperationWrapper {

    private final EntityManagerFactory entityManagerFactory;

    @Override
    public void performVoidOperationWithinTx(Consumer<EntityManager> entityManagerConsumer) {

        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            entityManagerConsumer.accept(entityManager);
            entityManager.getTransaction().commit();
        } catch (Exception e) {

            entityManager.getTransaction().rollback();
            throw new DaoException("Error while processing query", e);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public <T> T performReturningResultOperationWithinTx(Function<EntityManager, T> entityManagerTFunction) {

        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            T result = entityManagerTFunction.apply(entityManager);
            entityManager.getTransaction().commit();
            return result;
        } catch (Exception e) {

            entityManager.getTransaction().rollback();
            throw new DaoException("Error while processing query", e);
        } finally {
            entityManager.close();
        }
    }
}
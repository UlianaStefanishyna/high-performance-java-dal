package com.exercises.hibernate.service.impl;

import com.exercises.hibernate.model.Gym;
import com.exercises.hibernate.service.HibernateExercisesService;
import com.exercises.hibernate.util.DataGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.exercises.hibernate.util.service.impl.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Slf4j
@Service
@RequiredArgsConstructor
public class HibernateExercisesServiceImpl implements HibernateExercisesService {

    public static void main(String[] args) {
        EntityManagerFactory h2InMemoryDatabase = Persistence
                .createEntityManagerFactory("H2InMemoryDatabase");

        OperationWrapperImpl operationWrapper = new OperationWrapperImpl(h2InMemoryDatabase);


        Gym gym = DataGenerator.generateGym();
        operationWrapper.performVoidOperationWithinTx(entityManager -> {
            entityManager.persist(gym);
        });
        System.out.println("gym = " + gym);
    }
}


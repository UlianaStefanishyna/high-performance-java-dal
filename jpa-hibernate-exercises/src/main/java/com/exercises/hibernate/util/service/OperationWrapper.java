package com.exercises.hibernate.util.service;

import javax.persistence.EntityManager;
import java.util.function.Consumer;
import java.util.function.Function;

public interface OperationWrapper {

    void performVoidOperationWithinTx(Consumer<EntityManager> entityManagerConsumer);

    <T> T performReturningResultOperationWithinTx(Function<EntityManager, T> entityManagerTFunction);
}
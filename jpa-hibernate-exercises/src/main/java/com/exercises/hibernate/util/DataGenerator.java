package com.exercises.hibernate.util;

import com.exercises.hibernate.model.Coach;
import com.exercises.hibernate.model.Gym;

public class DataGenerator {

    public static Coach generateCoach() {
        return new Coach();
    }

    public static Gym generateGym() {
        return Gym.builder()
                .address("address")
                .name("name")
                .build();
    }
}
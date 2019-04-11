package com.exercises.hibernate.dao;

import com.exercises.hibernate.model.Gym;

import java.util.List;
import java.util.Optional;

public interface GymDao {

    void save(Gym gym);

    Optional<Gym> findById(Long id);

    List<Gym> findAll();

    void update(Gym gym);

    void delete(Long id);
}

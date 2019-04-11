package com.exercises.hibernate.dao;

import com.exercises.hibernate.model.Coach;

import java.util.List;
import java.util.Optional;

public interface CoachDao {

    void save(Coach coach);

    Optional<Coach> findById(Long id);

    List<Coach> findAll();

    void update(Coach coach);

    void delete(Long id);
}

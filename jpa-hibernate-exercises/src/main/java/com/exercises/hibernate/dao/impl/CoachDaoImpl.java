package com.exercises.hibernate.dao.impl;

import com.exercises.hibernate.dao.CoachDao;
import com.exercises.hibernate.model.Coach;

import java.util.List;
import java.util.Optional;

public class CoachDaoImpl implements CoachDao {
    @Override
    public void save(Coach coach) {

    }

    @Override
    public Optional<Coach> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Coach> findAll() {
        return null;
    }

    @Override
    public void update(Coach coach) {

    }

    @Override
    public void delete(Long id) {

    }
}

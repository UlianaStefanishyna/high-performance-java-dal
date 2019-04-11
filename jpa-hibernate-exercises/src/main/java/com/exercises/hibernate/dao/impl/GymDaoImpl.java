package com.exercises.hibernate.dao.impl;

import com.exercises.hibernate.dao.GymDao;
import com.exercises.hibernate.model.Gym;

import java.util.List;
import java.util.Optional;

public class GymDaoImpl implements GymDao {
    @Override
    public void save(Gym gym) {

    }

    @Override
    public Optional<Gym> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Gym> findAll() {
        return null;
    }

    @Override
    public void update(Gym gym) {

    }

    @Override
    public void delete(Long id) {

    }
}

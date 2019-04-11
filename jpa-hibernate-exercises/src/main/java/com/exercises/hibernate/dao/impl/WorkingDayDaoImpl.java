package com.exercises.hibernate.dao.impl;

import com.exercises.hibernate.dao.WorkingDayDao;
import com.exercises.hibernate.model.WorkingDay;
import com.exercises.hibernate.model.additional.Day;

import java.util.List;
import java.util.Optional;

public class WorkingDayDaoImpl implements WorkingDayDao {
    @Override
    public List<WorkingDay> findAll() {
        return null;
    }

    @Override
    public Optional<WorkingDay> findBy(Day day) {
        return Optional.empty();
    }
}

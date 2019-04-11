package com.exercises.hibernate.dao;

import com.exercises.hibernate.model.WorkingDay;
import com.exercises.hibernate.model.additional.Day;

import java.util.List;
import java.util.Optional;

public interface WorkingDayDao {

    List<WorkingDay> findAll();

    Optional<WorkingDay> findBy(Day day);
}
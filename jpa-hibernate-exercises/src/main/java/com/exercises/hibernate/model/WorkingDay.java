package com.exercises.hibernate.model;

import com.exercises.hibernate.model.additional.Day;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "working_day")
public class WorkingDay {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Enumerated(STRING)
    @Column(nullable = false)
    private Day day;

    @ManyToMany
    @JoinTable(name = "coach_day",
            joinColumns = @JoinColumn(name = "working_day_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "coach_id", referencedColumnName = "id"))
    private Set<Coach> coaches = new HashSet<>();
}
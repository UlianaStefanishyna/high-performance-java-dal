package com.exercises.hibernate.model;

import com.exercises.hibernate.model.additional.Level;
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
@Table(name = "coach")
public class Coach {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Long age;

    @Enumerated(STRING)
    @Column(nullable = false)
    private Level level;

    @ManyToMany(mappedBy = "coaches")
    private Set<WorkingDay> workingDays = new HashSet<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "gym_id")
    private Gym gym;
}
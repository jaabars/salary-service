package kg.easy.salaryservice.models.entities;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "employees")
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String surName;
    boolean active;
}

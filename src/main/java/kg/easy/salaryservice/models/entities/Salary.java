package kg.easy.salaryservice.models.entities;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Double salary;
    Date startDate;
    Date endDate;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    Employee employee;
}

package org.p2kyoo.springthymeleafproject.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.p2kyoo.springthymeleafproject.model.enums.Gender;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person extends Human{

    private Gender gender;

    private int age;

    private LocalDate dob;

    private LocalDate dateCreated;

    private LocalDate dateModified;

    private String address;
}

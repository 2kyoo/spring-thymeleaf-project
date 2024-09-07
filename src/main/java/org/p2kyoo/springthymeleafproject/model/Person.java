package org.p2kyoo.springthymeleafproject.model;

import org.p2kyoo.springthymeleafproject.model.enums.Gender;

import java.time.LocalDate;

public class Person extends Human{

    private Gender gender;

    private int age;

    private LocalDate dob;

    private LocalDate dateCreated;

    private LocalDate dateModified;

    private String address;
}

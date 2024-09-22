package org.p2kyoo.springthymeleafproject.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course extends BasedEntity{

    private String courseName;
    private int coursePrice;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_course",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private List<Student> students;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    private List<Master> masters;


}

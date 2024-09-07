package org.p2kyoo.springthymeleafproject.model;

import java.util.List;

public class Course extends BasedEntity{

    private String courseName;
    private int coursePrice;
    private List<Student> students;
    private List<Master> masters;


}

package org.p2kyoo.springthymeleafproject.model;

import java.util.List;

public class User extends BasedEntity{

    private String username;
    private String password;

    private List<Role> roles;
    private Student student;
    private Master master;
    private Admin admin;
}

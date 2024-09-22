package org.p2kyoo.springthymeleafproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Role {
    @Id
    private long id;

    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}

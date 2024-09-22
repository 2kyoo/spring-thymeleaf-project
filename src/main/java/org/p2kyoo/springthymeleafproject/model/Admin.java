package org.p2kyoo.springthymeleafproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Admin extends Human {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}

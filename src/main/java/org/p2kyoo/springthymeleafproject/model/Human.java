package org.p2kyoo.springthymeleafproject.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Human extends BasedEntity{

    private String firstname;
    private String lastname;
    private String phone;

}

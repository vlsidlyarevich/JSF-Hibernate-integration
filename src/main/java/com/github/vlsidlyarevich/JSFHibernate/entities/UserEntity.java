package com.github.vlsidlyarevich.JSFHibernate.entities;


import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Table( name= "users")
public class UserEntity {


    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name",length = 45)
    private String name;

    @Column(name = "role",length = 45)
    private String role;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

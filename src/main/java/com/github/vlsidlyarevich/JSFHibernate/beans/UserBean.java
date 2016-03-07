package com.github.vlsidlyarevich.JSFHibernate.beans;


import com.github.vlsidlyarevich.JSFHibernate.dao.UserDAO;
import com.github.vlsidlyarevich.JSFHibernate.entities.UserEntity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserBean {

    private String name;
    private String role;

    public String saveUser(){
        UserDAO userDAO = new UserDAO();
        Integer userID = userDAO.getId();
        UserEntity userEntity = new UserEntity(userID,name,role);
        userDAO.save(userEntity);
        System.out.println("User successfully saved.");
        return "output";
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

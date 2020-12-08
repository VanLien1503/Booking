package com.codegym.model.decentralization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Role;
    private String name_Role;

    public Role() {
    }

    public Role(String name_Role) {
        this.name_Role = name_Role;
    }

    public Integer getId_Role() {
        return id_Role;
    }

    public void setId_Role(Integer id_Role) {
        this.id_Role = id_Role;
    }

    public String getName_Role() {
        return name_Role;
    }

    public void setName_Role(String name_Role) {
        this.name_Role = name_Role;
    }
}

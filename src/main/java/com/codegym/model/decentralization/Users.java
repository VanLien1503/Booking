package com.codegym.model.decentralization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Users;
    private String name_User;
    private String password;
    private String address;
    private Integer age;

    public Users() {
    }

    public Users(String name_User, String password, String address, Integer age) {
        this.name_User = name_User;
        this.password = password;
        this.address = address;
        this.age = age;
    }

    public Integer getId_Users() {
        return id_Users;
    }

    public void setId_Users(Integer id_Users) {
        this.id_Users = id_Users;
    }

    public String getName_User() {
        return name_User;
    }

    public void setName_User(String name_User) {
        this.name_User = name_User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

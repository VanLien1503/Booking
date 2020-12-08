package com.codegym.model.decentralization;

import javax.persistence.*;

@Entity
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Users_Role;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public User_Role() {
    }

    public User_Role(Role role, Users users) {
        this.role = role;
        this.users = users;
    }

    public Integer getId_Users_Role() {
        return id_Users_Role;
    }

    public void setId_Users_Role(Integer id_Users_Role) {
        this.id_Users_Role = id_Users_Role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}

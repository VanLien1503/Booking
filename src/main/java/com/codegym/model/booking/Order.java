package com.codegym.model.booking;

import com.codegym.model.decentralization.Users;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date start;
    private Date stop;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;


    public Order() {
    }

    public Order(Date start, Date stop, Users users) {
        this.start = start;
        this.stop = stop;
        this.users = users;
    }


    public Integer getId_Order() {
        return id;
    }

    public void setId_Order(Integer id_Order) {
        this.id = id_Order;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getStop() {
        return stop;
    }

    public void setStop(Date stop) {
        this.stop = stop;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}

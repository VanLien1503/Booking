package com.codegym.model.booking;

import javax.persistence.*;

@Entity
public class OrderDetails {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_OrderDetails;
    private Integer quantity;


    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderDetails(Integer quantity, Room room, Order order) {
        this.quantity = quantity;
        this.room = room;
        this.order = order;
    }

    public OrderDetails() {
    }

    public OrderDetails(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId_OrderDetails() {
        return id_OrderDetails;
    }

    public void setId_OrderDetails(Integer id_OrderDetails) {
        this.id_OrderDetails = id_OrderDetails;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

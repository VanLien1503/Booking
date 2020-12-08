package com.codegym.model.booking;

import javafx.scene.image.Image;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Room;
    private String name_Room;
    private String image_Room;
    private Double discount;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;


    public Room() {
    }

    public Room(String name_Room, String image_Room, Double discount, boolean status, Category category, Hotel hotel) {
        this.name_Room = name_Room;
        this.image_Room = image_Room;
        this.discount = discount;
        this.status = status;
        this.category = category;
        this.hotel = hotel;
    }

    public Integer getId_Room() {
        return id_Room;
    }

    public void setId_Room(Integer id_Room) {
        this.id_Room = id_Room;
    }

    public String getName_Room() {
        return name_Room;
    }

    public void setName_Room(String name_Room) {
        this.name_Room = name_Room;
    }

    public String getImage_Room() {
        return image_Room;
    }

    public void setImage_Room(String image_Room) {
        this.image_Room = image_Room;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}

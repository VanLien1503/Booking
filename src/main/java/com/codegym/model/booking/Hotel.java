package com.codegym.model.booking;

import javax.persistence.*;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_hotel;
    private String name_hotel;
    private String address_hotel;
@ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    public Hotel() {
    }

    public Hotel(String name_hotel, String address_hotel, Province province) {
        this.name_hotel = name_hotel;
        this.address_hotel = address_hotel;
        this.province = province;
    }

    public Integer getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(Integer id_hotel) {
        this.id_hotel = id_hotel;
    }

    public String getName_hotel() {
        return name_hotel;
    }

    public void setName_hotel(String name_hotel) {
        this.name_hotel = name_hotel;
    }

    public String getAddress_hotel() {
        return address_hotel;
    }

    public void setAddress_hotel(String address_hotel) {
        this.address_hotel = address_hotel;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}

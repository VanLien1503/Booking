package com.codegym.model.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Category;
    private String name_Category;
    private Double price_Category;

    public Category() {
    }

    public Category(String name_Category, Double price_Category) {
        this.name_Category = name_Category;
        this.price_Category = price_Category;
    }

    public Integer getId_Category() {
        return id_Category;
    }

    public void setId_Category(Integer id_Category) {
        this.id_Category = id_Category;
    }

    public String getName_Category() {
        return name_Category;
    }

    public void setName_Category(String name_Category) {
        this.name_Category = name_Category;
    }

    public Double getPrice_Category() {
        return price_Category;
    }

    public void setPrice_Category(Double price_Category) {
        this.price_Category = price_Category;
    }
}

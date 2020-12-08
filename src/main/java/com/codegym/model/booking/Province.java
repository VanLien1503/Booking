package com.codegym.model.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Province {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameProvince;

    public Province() {
    }

    public Province(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }
}

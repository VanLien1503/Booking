package com.codegym.model.booking;

import javax.persistence.*;
import java.util.List;

@Entity
public class Utilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Utilities;
    private String list;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Utilities() {
    }

    public Utilities(String list, Category category) {
        this.list = list;
        this.category = category;
    }

    public Integer getId_Utilities() {
        return id_Utilities;
    }

    public void setId_Utilities(Integer id_Utilities) {
        this.id_Utilities = id_Utilities;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

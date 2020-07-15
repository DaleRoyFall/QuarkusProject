package com.unifun.tables;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "movie_category")
public class MovieCategory extends PanacheEntityBase {

    @Id
    @Column(nullable = false)
    private String categoryName;

    public MovieCategory() {}

    public MovieCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

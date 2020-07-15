package com.unifun.tables;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    
    @ManyToOne
    @JoinColumn(name = "categoryName")
    public MovieCategory movieCategory;

    public Movie() {}

    public Movie(String name, MovieCategory movieCategory) {
        this.name = name;
        this.movieCategory = movieCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(MovieCategory movieCategory) {
        this.movieCategory = movieCategory;
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movieCategory=" + movieCategory +
                '}' + "\n";
    }
}

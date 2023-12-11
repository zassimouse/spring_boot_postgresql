package com.example.postgresql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String album;
    private String artist;
    private Integer year;
    private Double price;
    private Integer count;


    private String description;

    public Product() {
    }

//    public Product(Long id, String name, String description) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//    }


    public Product( String type, String album, String artist, Integer year, Double price, Integer count, String description) {
//        this.id = id;
        this.type = type;
        this.album = album;
        this.artist = artist;
        this.year = year;
        this.price = price;
        this.count = count;
        this.description = description;
    }
}
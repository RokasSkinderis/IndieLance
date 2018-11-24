package com.indieLance.indieLanceServerSide.entities;

import javax.persistence.*;

@Entity
public class Review{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String review;

    public Review(){}

    public Review(String review) {
        this.review = review;
    }
}

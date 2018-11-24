package com.indieLance.indieLanceServerSide.entities;

import javax.persistence.*;

@Entity
public class PostReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    Post post;

    @OneToOne
    @JoinColumn(name = "review_id")
    Review review;

    @OneToOne
    @JoinColumn(name = "rating_id")
    Rating rating;

    public PostReview(User user, Post post, Review review, Rating rating) {
        this.user = user;
        this.post = post;
        this.review = review;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}

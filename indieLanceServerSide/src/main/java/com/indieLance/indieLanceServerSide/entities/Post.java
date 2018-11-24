package com.indieLance.indieLanceServerSide.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    String title;

    String description;

    @OneToOne
    @JoinColumn(name = "category_id")
    Category category;

    @OneToMany
    List<PostReview> reviews;

    @OneToMany
    List<PostFile> files;

    public Post(){}

    public Post(User user, String title, String description, Category category) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.category = category;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<PostReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<PostReview> reviews) {
        this.reviews = reviews;
    }

    public List<PostFile> getFiles() {
        return files;
    }

    public void setFiles(List<PostFile> files) {
        this.files = files;
    }
}

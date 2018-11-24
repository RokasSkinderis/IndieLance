package com.indieLance.indieLanceServerSide.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String email;

    //TODO normalizuoti
    private String phone;
    private String region;

    @OneToMany(mappedBy = "sender")
    private List<Message> sentMessages;

    @OneToMany(mappedBy = "reciever")
    private List<Message> recievedMessages;

    @OneToMany(mappedBy = "user")
    private List<UserReview> reviewsGot;

    @OneToMany(mappedBy = "rater")
    private List<UserReview> reviewsGiven;

    @OneToMany(mappedBy = "user")
    private List<UserFile> userFiles;

    protected User(){}

    public User(String name, String lastName, String email, String phone, String region) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.region = region;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Message> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<Message> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public List<Message> getRecievedMessages() {
        return recievedMessages;
    }

    public void setRecievedMessages(List<Message> recievedMessages) {
        this.recievedMessages = recievedMessages;
    }

    public List<UserReview> getReviewsGot() {
        return reviewsGot;
    }

    public void setReviewsGot(List<UserReview> reviewsGot) {
        this.reviewsGot = reviewsGot;
    }

    public List<UserReview> getReviewsGiven() {
        return reviewsGiven;
    }

    public void setReviewsGiven(List<UserReview> reviewsGiven) {
        this.reviewsGiven = reviewsGiven;
    }

    public List<UserFile> getUserFiles() {
        return userFiles;
    }

    public void setUserFiles(List<UserFile> userFiles) {
        this.userFiles = userFiles;
    }
}

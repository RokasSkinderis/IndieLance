package com.indieLance.indieLanceServerSide.entities;

import javax.persistence.*;

@Entity
public class Message{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    String messageContent;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    User sender;

    @ManyToOne
    @JoinColumn(name = "reciever_id")
    User reciever;

    public Message(){}

    public Message(String messageContent, User sender, User reciever) {
        this.messageContent = messageContent;
        this.sender = sender;
        this.reciever = reciever;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReciever() {
        return reciever;
    }

    public void setReciever(User reciever) {
        this.reciever = reciever;
    }
}

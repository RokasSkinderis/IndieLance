package com.indieLance.indieLanceServerSide.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    String messageContent;

    LocalDateTime sentAt;

    LocalDateTime redAt;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    User sender;

    @ManyToOne
    @JoinColumn(name = "reciever_id")
    User reciever;
}

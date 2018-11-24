package com.indieLance.indieLanceServerSide.entities;


import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private @NonNull String name;
    private @NonNull String lastName;
    private @NonNull String email;

    //TODO normalizuoti
    private @NonNull String phone;
    private @NonNull String region;

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

    public User(String name, String lastName, String email, String phone, String region) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.region = region;
    }
}

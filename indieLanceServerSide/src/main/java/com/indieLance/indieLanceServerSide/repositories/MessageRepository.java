package com.indieLance.indieLanceServerSide.repositories;

import com.indieLance.indieLanceServerSide.entities.Message;
import com.indieLance.indieLanceServerSide.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query("SELECT m from Message m where m.reciever in(?1, ?2) and m.sender in(?1, ?2) order by m.sentAt")
    List<Message> getConversation(User user1, User user2);

}

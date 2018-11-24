package com.indieLance.indieLanceServerSide.graphQLQueries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.indieLance.indieLanceServerSide.entities.Message;
import com.indieLance.indieLanceServerSide.entities.User;
import com.indieLance.indieLanceServerSide.graphQLQueries.exceptions.UserNotFoundException;
import com.indieLance.indieLanceServerSide.repositories.MessageRepository;
import com.indieLance.indieLanceServerSide.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MessageQuery implements GraphQLQueryResolver{

    @Autowired
    private  MessageRepository messageRepository;

    @Autowired
    private UserRepository userRepository;

    public Message getMessageById(Long id){
        Optional<Message> message = messageRepository.findById(id);
        return message.get();
    }

    public List<Message> getConversation(Long id1, Long id2){
        Optional<User> user = userRepository.findById(id1);
        Optional<User> user2 = userRepository.findById(id1);
        if(user.isPresent() && user2.isPresent()) {
            return messageRepository.getConversation(user.get(), user2.get());
        } else {
            if(!user.isPresent()) {
                throw new UserNotFoundException(user.get().getId());
            }
            throw new UserNotFoundException(user2.get().getId());
        }
    }
}

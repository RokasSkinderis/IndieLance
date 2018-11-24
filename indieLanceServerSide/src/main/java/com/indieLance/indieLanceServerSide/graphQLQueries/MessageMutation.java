package com.indieLance.indieLanceServerSide.graphQLQueries;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.indieLance.indieLanceServerSide.entities.Message;
import com.indieLance.indieLanceServerSide.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageMutation implements GraphQLMutationResolver {

    @Autowired
    MessageRepository messageRepository;

    /*Message newMessage(Message input){
        //input
    }*/
}

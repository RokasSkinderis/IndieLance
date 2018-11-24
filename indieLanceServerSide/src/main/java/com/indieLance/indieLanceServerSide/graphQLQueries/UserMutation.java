package com.indieLance.indieLanceServerSide.graphQLQueries;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.indieLance.indieLanceServerSide.entities.User;
import com.indieLance.indieLanceServerSide.graphQLQueries.exceptions.UserNotFoundException;
import com.indieLance.indieLanceServerSide.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User newUser(User input){
        User user = new User(input.getName(), input.getLastName(), input.getEmail(), input.getPhone(), input.getRegion());
        return userRepository.save(user);
    }

    public User updateUser(User input){
        Optional<User> user = userRepository.findById(input.getId());
        if(user.isPresent()){
            return userRepository.save(input);
        }else {
            throw new UserNotFoundException(input.getId());
        }
    }
}

package com.indieLance.indieLanceServerSide.graphQLQueries;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.indieLance.indieLanceServerSide.entities.User;
import com.indieLance.indieLanceServerSide.graphQLQueries.inputs.UserInput;
import com.indieLance.indieLanceServerSide.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User newUser(UserInput input){
        User user = new User(input.getName(), input.getLastName(), input.getEmail(), input.getPhone(), input.getRegion());
        return userRepository.save(user);
    }
}

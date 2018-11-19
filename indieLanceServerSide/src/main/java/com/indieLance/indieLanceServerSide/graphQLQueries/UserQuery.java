package com.indieLance.indieLanceServerSide.graphQLQueries;



import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.indieLance.indieLanceServerSide.entities.User;
import com.indieLance.indieLanceServerSide.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserQuery implements GraphQLQueryResolver{

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}

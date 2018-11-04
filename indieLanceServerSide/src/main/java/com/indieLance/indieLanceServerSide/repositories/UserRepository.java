package com.indieLance.indieLanceServerSide.repositories;

import com.indieLance.indieLanceServerSide.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}

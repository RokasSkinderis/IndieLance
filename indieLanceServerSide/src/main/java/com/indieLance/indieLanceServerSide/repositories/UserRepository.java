package com.indieLance.indieLanceServerSide.repositories;

import com.indieLance.indieLanceServerSide.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}

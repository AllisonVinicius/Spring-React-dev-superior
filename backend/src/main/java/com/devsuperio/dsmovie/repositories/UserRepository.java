package com.devsuperio.dsmovie.repositories;

import com.devsuperio.dsmovie.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

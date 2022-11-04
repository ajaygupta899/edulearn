package com.ajay.edulearn.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Users findByEmail(String email);


}

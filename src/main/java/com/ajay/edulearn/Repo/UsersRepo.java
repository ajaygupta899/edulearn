package com.ajay.edulearn.Repo;

import com.ajay.edulearn.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Users findByEmail(String email);


}

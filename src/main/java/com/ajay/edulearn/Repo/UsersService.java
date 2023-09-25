package com.ajay.edulearn.Repo;


import com.ajay.edulearn.model.ApiResponse;
import com.ajay.edulearn.model.LoginRequest;
import com.ajay.edulearn.model.Users;

import java.util.List;

public interface UsersService {
    Users saveUsers(Users users);
    List<Users> getAllUsers();

    ApiResponse login(LoginRequest loginRequest) ;
}

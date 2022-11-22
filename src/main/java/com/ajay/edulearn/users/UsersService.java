package com.ajay.edulearn.users;


import java.util.List;

public interface UsersService {
    Users saveUsers(Users users);
    List<Users> getAllUsers();

    ApiResponse login(LoginRequest loginRequest) ;
}

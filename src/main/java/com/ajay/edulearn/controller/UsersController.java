package com.ajay.edulearn.controller;

import com.ajay.edulearn.model.ApiResponse;
import com.ajay.edulearn.model.LoginRequest;
import com.ajay.edulearn.model.Users;
import com.ajay.edulearn.Repo.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UsersService usersService;

@Autowired
    public UsersController(UsersService usersService){
    this.usersService=usersService;
}

    @PostMapping("/signup")
    public ResponseEntity<Users> saveUsers(@RequestBody Users users){

    return new ResponseEntity<Users>(usersService.saveUsers(users), HttpStatus.CREATED);
}

    @GetMapping("/all")
    public List<Users> getAllUsers(){
    return usersService.getAllUsers();
}
//////////////////////////hello///////////////
    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginRequest loginRequest)  {
    return usersService.login(loginRequest);
    }

}

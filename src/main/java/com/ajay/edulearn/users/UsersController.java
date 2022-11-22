package com.ajay.edulearn.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
//////////////////////////hello//////////////
    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginRequest loginRequest)  {
    return usersService.login(loginRequest);
    }

}

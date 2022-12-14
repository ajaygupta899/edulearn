package com.ajay.edulearn.users;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public  class userServiceImpl implements UsersService {
    private UsersRepo usersRepo;


    public userServiceImpl(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public Users saveUsers(Users users) {

        return usersRepo.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }


   @Override
    public ApiResponse login(LoginRequest loginRequest) {
        Users users=usersRepo.findByEmail(loginRequest.getEmail());
        if(users==null){
            throw new RuntimeException("user not exist");
        }
        if(!users.getPassword().equals((loginRequest.getPassword()))){
            throw new RuntimeException("password not exist");
        }
       //String msg = "{\"id\":\""+users.getId()+"\"}";

       return new ApiResponse("200","Login successfully",users.getId());
    }

}
package com.example.studentmenagmentapp.Services;

import com.example.studentmenagmentapp.Models.Users;
import com.example.studentmenagmentapp.DBConnection;
import com.example.studentmenagmentapp.Repository.UserRepository;

public class UsersService {
    private UserRepository userRepository=new UserRepository();

    public void shtoTeDhena(String username,String password,String role){
        Users u=new Users(username,password,role);
        userRepository.shtoUser(u);
    }
}

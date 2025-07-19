package com.example.studentmenagmentapp.Services;

import com.example.studentmenagmentapp.Models.Users;
import com.example.studentmenagmentapp.DBConnection;
import com.example.studentmenagmentapp.Repository.UserRepository;
import org.mindrot.jbcrypt.BCrypt;

public class UsersService {
    private UserRepository userRepository=new UserRepository();


    public void shtoTeDhena(String username,String password,String role){
        String hashedPassword= BCrypt.hashpw(password,BCrypt.gensalt());
        Users u=new Users(username,hashedPassword,role);
        userRepository.shtoUser(u);
    }
}

package com.example.studentmenagmentapp.Controllers;

import com.example.studentmenagmentapp.Models.Users;
import com.example.studentmenagmentapp.DBConnection;
import com.example.studentmenagmentapp.Repository.UserRepository;
import com.example.studentmenagmentapp.Services.UsersService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;


public class UserController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    private TextField role;

    private UsersService us=new UsersService();

    public void shtoUserin(){
        String name=username.getText();
        String pass=password.getText();
        String r=role.getText();

        us.shtoTeDhena(name,pass,r);

        username.clear();
        password.clear();
        role.clear();
    }


}

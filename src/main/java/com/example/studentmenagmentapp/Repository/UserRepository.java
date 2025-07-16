package com.example.studentmenagmentapp.Repository;
import com.example.studentmenagmentapp.Models.Users;
import com.example.studentmenagmentapp.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRepository {
    public void shtoUser(Users user){
        try {
            Connection con=DBConnection.getConnection();
            String query="INSERT INTO users(username,password,role) VALUES(?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getRole());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

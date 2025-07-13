package com.example.studentmenagmentapp.Repository;

import com.example.studentmenagmentapp.DBConnection;
import com.example.studentmenagmentapp.Models.Student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepository {
    public void ShtoTeDhena(Student student){
        try {
            Connection conn= DBConnection.getConnection();
            String query="INSERT INTO students(emer,mbiemer,email) VALUES(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,student.getEmer());
            ps.setString(2,student.getMbiemer());
            ps.setString(3,student.getEmail());
            ps.executeUpdate();
            System.out.println("Studenti u shtua me sukses");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.example.studentmenagmentapp.Repository;

import com.example.studentmenagmentapp.DBConnection;
import com.example.studentmenagmentapp.Models.Student;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Student>gjejTeGjithe(){
        List<Student>studentet=new ArrayList<>();
        String query="SELECT * FROM students";
        try{
            Connection con=DBConnection.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("emer"),
                        rs.getString("mbiemer"),
                        rs.getString("email")

                );
                studentet.add(s);
            }

        }catch (SQLException e) {
            System.err.println("Gabim gjatë marrjes së studentëve: " + e.getMessage());
        }
        return studentet;

    }
}

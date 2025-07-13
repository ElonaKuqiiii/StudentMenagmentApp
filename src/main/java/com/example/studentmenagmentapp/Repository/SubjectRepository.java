package com.example.studentmenagmentapp.Repository;

import com.example.studentmenagmentapp.DBConnection;
import com.example.studentmenagmentapp.Models.Subject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    public static void shtoLenden(Subject subject){
        try{
            Connection conn= DBConnection.getConnection();
            String query="INSERT INTO subjects(lenda,prof,nota) VALUES(?,?,?)";

            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, subject.getLenda());
            ps.setString(2,subject.getProf());
            ps.setInt(3,subject.getNota());
            ps.executeUpdate();



        }catch (SQLException e){
            System.out.println(e.getErrorCode());
        }

    }

    public static List<Subject> shfaq(){
        List<Subject>lendet=new ArrayList<>();
        try{

            Connection conn=DBConnection.getConnection();
            String showquery="SELECT * FROM subjects";

            Statement stms= conn.createStatement();
            ResultSet rs=stms.executeQuery(showquery);
            while (rs.next()){
                Subject s=new Subject(
                rs.getInt("id"),
                rs.getString("lenda"),
                rs.getString("prof"),
                rs.getInt("nota")
               );
                lendet.add(s);
            }

        }catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
     return lendet;
    }
}

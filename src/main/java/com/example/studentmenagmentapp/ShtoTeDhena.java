package com.example.studentmenagmentapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ShtoTeDhena {
    public static void main(String[] args){
        Connection conn=DBConnection.getConnection();
        String query="INSERT INTO students(emer,mbiemer,email) VALUES(?,?,?)"
                ;

        try{
            PreparedStatement preparedStatement=conn.prepareStatement(query);
            preparedStatement.setString(1,"Elona");
            preparedStatement.setString(2,"Kuqi");
            preparedStatement.setString(3,"elona.kuqi@gmail.com");
            preparedStatement.setString(1, "Ardit");
            preparedStatement.setString(2, "Gashi");
            preparedStatement.setString(3, "ardit.gashi@example.com");

            preparedStatement.executeUpdate();
            System.out.println("Studenti u shtua me sukses");



        }catch(SQLException e){
            System.out.println("Gabim gjate fshirjes se studentit:");
            e.printStackTrace();
        }
    }

}

package com.example.studentmenagmentapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;

 class KrijoTable {
     public static void krijoTable(){
        Connection conn=DBConnection.getConnection();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students("
                + "id SERIAL PRIMARY KEY,"
                + "emer VARCHAR(50),"
                + "mbiemer VARCHAR(50),"
                + "email VARCHAR(100)" + ");";

        try{
            Statement statement=conn.createStatement();
            statement.executeUpdate(createTableSQL);
            System.out.println("Tabela u krijuar me sukses");
        }catch (SQLException e){
            System.out.println("Gabim gjate krijimit te tabeles:");
            e.printStackTrace();

        }

    }
}

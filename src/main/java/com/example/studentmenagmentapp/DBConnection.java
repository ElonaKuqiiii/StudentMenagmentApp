package com.example.studentmenagmentapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection=null;
    private static final String DB_URL=
            "jdbc:postgresql://localhost:5432/StudentMenagment";
    private static final String DB_USER="postgres";
    private static final String DB_PASSWORD="123";

    public static Connection getConnection(){
        if(connection==null){
            try{
                connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
                System.out.println("Lidhja me databaze u krye me sukses");
            }catch (SQLException e){
                e.printStackTrace();
                return null;
            }

        }
        return connection;
    }


}

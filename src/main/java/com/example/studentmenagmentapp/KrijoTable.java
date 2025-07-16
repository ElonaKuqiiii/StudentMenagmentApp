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

        String createTable="CREATE TABLE IF NOT EXISTS subjects( "
                +"id SERIAL PRIMARY KEY,"
                +"lenda VARCHAR(50),"
                +"prof VARCHAR(50),"
                +"nota INT"
                +");";

         String createTable2 = "CREATE TABLE IF NOT EXISTS users ("
                 + "id SERIAL PRIMARY KEY,"
                 + "username VARCHAR(50) UNIQUE NOT NULL,"
                 + "password VARCHAR(255) NOT NULL,"
                 + "role VARCHAR(20) NOT NULL"
                 + ");";





         try{
            Statement statement=conn.createStatement();
            //statement.executeUpdate(createTableSQL);
           // statement.executeUpdate(createTable);
            statement.executeUpdate(createTable2);
            System.out.println("Tabela u krijuar me sukses");
        }catch (SQLException e){
            System.out.println("Gabim gjate krijimit te tabeles:");
            e.printStackTrace();

        }

    }
}

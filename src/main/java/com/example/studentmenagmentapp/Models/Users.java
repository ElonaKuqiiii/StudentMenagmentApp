package com.example.studentmenagmentapp.Models;

//String createTable2 = "CREATE TABLE IF NOT EXISTS users ("
//        + "id SERIAL PRIMARY KEY,"
//        + "username VARCHAR(50) UNIQUE NOT NULL,"
//        + "password VARCHAR(255) NOT NULL,"
//        + "role VARCHAR(20) NOT NULL"
//        + ");";


public class Users {
    private int id;
    private String username;
    private String password;
    private String role;
    public Users(String username, String password, String role){
        this.username=username;
        this.password=password;
        this.role=role;
    }

    public Users(int id,String username,String password,String role){
        this.id=id;
        this.username=username;
        this.password=password;
        this.role=role;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setRole(String role){
        this.role=role;
    }

    public int getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getRole(){
        return this.role;
    }

}

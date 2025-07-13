package com.example.studentmenagmentapp.Models;

public class Student {
    private int id;
    private String emer;
    private String mbiemer;
    private String email;
    public Student(String emer,String mbiemer,String email){
        this.emer=emer;
        this.mbiemer=mbiemer;
        this.email=email;
    }

    public Student(int id, String emer, String mbiemer, String email) {
        this.id = id;
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.email = email;
    }

    public int getId(){return id;}
    public String getEmer(){return emer;}
    public String getMbiemer(){return mbiemer;}
    public String getEmail(){return email;}

    public void setId(int id){this.id=id;}
    public void setEmer(String emer) { this.emer = emer; }
    public void setMbiemer(String mbiemer) { this.mbiemer = mbiemer; }
    public void setEmail(String email) { this.email = email; }






}

package com.example.studentmenagmentapp.Models;

public class Subject {
    private int id;
    private String lenda;
    private String prof;
    private int nota;

    public Subject(String lenda, String prof, int nota){
        this.lenda=lenda;
        this.prof=prof;
        this.nota=nota;
    }
    public Subject(int id, String lenda, String prof, int nota){
        this.id=id;
        this.lenda=lenda;
        this.prof=prof;
        this.nota=nota;
    }

    public void setId(int id){this.id=id;}
    public int getId(){return id;}
    public void setLenda(String lenda){this.lenda=lenda;}
    public String getLenda(){return lenda;}
    public void setNota(int nota){this.nota=nota;}
    public int getNota(){return nota;}
    public void setProf(String prof){this.prof=prof;}
    public String getProf(){return prof;}

}

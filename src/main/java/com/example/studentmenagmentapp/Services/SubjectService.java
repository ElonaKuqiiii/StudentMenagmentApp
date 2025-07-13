package com.example.studentmenagmentapp.Services;

import com.example.studentmenagmentapp.Models.Subject;
import com.example.studentmenagmentapp.Repository.SubjectRepository;

import java.util.List;

public class SubjectService {
    private SubjectRepository subjectRepository;
    public SubjectService(){
        this.subjectRepository=new SubjectRepository();
    }

    public void shtoLenden(String lenda,String prof,int nota){
        Subject s=new Subject(lenda,prof,nota);
        SubjectRepository.shtoLenden(s);
    }

    public List<Subject> shfaq(){
       return SubjectRepository.shfaq();
    }

    public void fshiLenden(String emriLendes){
        subjectRepository.fshijeLenden(emriLendes);
    }
}

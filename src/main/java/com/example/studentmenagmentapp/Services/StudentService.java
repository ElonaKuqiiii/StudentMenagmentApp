package com.example.studentmenagmentapp.Services;

import com.example.studentmenagmentapp.Models.Student;
import com.example.studentmenagmentapp.Repository.StudentRepository;

public class StudentService {
    private StudentRepository studentRepository;

    public  StudentService(){
        studentRepository=new StudentRepository();
    }
    public void shtoStudent(String emer,String mbiemer,String email){
        Student student=new Student(emer,mbiemer,email);
        studentRepository.ShtoTeDhena(student);
    }
}

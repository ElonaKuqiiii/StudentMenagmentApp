package com.example.studentmenagmentapp.Controllers;

import com.example.studentmenagmentapp.Services.StudentService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import com.example.studentmenagmentapp.Models.Student;
import com.example.studentmenagmentapp.Repository.StudentRepository;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class StudentController {
    @FXML
    private TableView<Student> table;

    @FXML
    private TextField idfield;

    @FXML
    private TableColumn<Student, Integer> id;
    @FXML
    private TableColumn<Student, String> emer;
    @FXML
    private TableColumn<Student, String> mbiemer;
    @FXML
    private TableColumn<Student, String> email;

    @FXML
    private TextField emerfield;
    @FXML
    private TextField mbiemerfield;
    @FXML
    private TextField emailfield;

    @FXML
    private Button shto;


    private final StudentService studentService=new StudentService();


    // Lista që mbahet në memorien e aplikacionit për të mbushur TableView
    private ObservableList<Student> studentList;

    @FXML
    public void initialize(){
        // Lidh kolonat e TableView me fushat e modelit Student
        id.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());
        emer.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmer()));
        mbiemer.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMbiemer()));
        email.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));

        // Merr të gjithë studentët nga databaza dhe mbushi në TableView
       studentList = FXCollections.observableArrayList(studentService.gjejTeGjitheStudentet());
        table.setItems(studentList);

    }


    @FXML
    private void shtoStudent(){
        String emri=emerfield.getText();
        String mbiemri=mbiemerfield.getText();
        String email=emailfield.getText();

        Student student = new Student(emri, mbiemri, email);
        studentService.shtoStudent(emri,mbiemri,email);
        studentList.add(student);

        emerfield.clear();
        mbiemerfield.clear();
        emailfield.clear();


    }

    @FXML
    private void fshijeStudentin(){
        String id=idfield.getText();
        Integer idja=Integer.parseInt(id);
        studentService.fshijeStudentin(idja);
        for(Student s:studentList){
            if(idja==s.getId()){
                studentList.remove(s);
            }
        }

        idfield.clear();

    }
}

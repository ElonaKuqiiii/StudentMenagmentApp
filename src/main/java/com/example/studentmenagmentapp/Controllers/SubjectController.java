package com.example.studentmenagmentapp.Controllers;

import com.example.studentmenagmentapp.Models.Subject;
import com.example.studentmenagmentapp.Services.SubjectService;
import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SubjectController {
    @FXML
    private TableView<Subject>table;

    @FXML
    private TextField lendafield;
    @FXML
    private TextField proffield;
    @FXML
    private TextField notafield;

    @FXML
    private TableColumn<Subject ,Integer>id;

    @FXML
    private TableColumn<Subject,String>lenda;
    @FXML
    private TableColumn<Subject,String>prof;
    @FXML
    private TableColumn<Subject,Integer>nota;

    @FXML
    private Button shto;

   private SubjectService subjectService=new SubjectService();
   private ObservableList<Subject> lendet;

   public void initialize(){
       id.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());
       lenda.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLenda()));
       prof.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getProf()));
       nota.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getNota()).asObject());

       // Merr lëndët nga databaza dhe vendosi në TableView
       lendet = FXCollections.observableArrayList(subjectService.shfaq());
       table.setItems(lendet);
   }
   @FXML
   private void shtoLenden(){
       String lenda=lendafield.getText();
       String prof=proffield.getText();
       int nota=Integer.parseInt(notafield.getText());

       Subject s=new Subject(lenda,prof,nota);
       subjectService.shtoLenden(lenda,prof,nota);
       lendet.add(s);

       lendafield.clear();
       proffield.clear();
       notafield.clear();

   }


}

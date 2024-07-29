package com.example;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControllerViewTable implements Initializable{
    
    @FXML 
    TableView<Eventi> tab_Evento;
     
    @FXML 
    TableColumn<Eventi, Integer> col_Id_Evento;

    @FXML 
    TableColumn<Eventi, String> col_Nome_Evento;

    @FXML 
    TableColumn<Eventi, LocalDate> col_Data_Evento;
    
    Eventi evento = null;

    ObservableList<Eventi>  EventList = FXCollections.observableArrayList(
        new Eventi(0, "MotoGp", null),
        new Eventi(1, "MotoGp1", null),
        new Eventi(2, "MotoGp2", null) 
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        col_Id_Evento.setCellValueFactory(new PropertyValueFactory<Eventi, Integer>("Id"));
        col_Nome_Evento.setCellValueFactory(new PropertyValueFactory<Eventi, String>("Nome"));
        col_Data_Evento.setCellValueFactory(new PropertyValueFactory<Eventi, LocalDate>("Data"));
        
        tab_Evento.getItems().setAll(EventList);
        
    }
}

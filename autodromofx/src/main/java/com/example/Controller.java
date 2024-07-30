package com.example;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{

    @FXML 
    DatePicker picker_Data_Evento;

    @FXML 
    TextField text_Id_Evento;

    @FXML 
    TextField text_Nome_Evento;

    @FXML
    TableView<Eventi> view_Evento;

    @FXML 
    TableColumn<Eventi, Integer> col_Id_Evento;

    @FXML 
    TableColumn<Eventi, String> col_Nome_Evento;

    @FXML 
    TableColumn<Eventi, LocalDate> col_Data_Evento;

    ObservableList<Eventi>  EventList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        col_Id_Evento.setCellValueFactory(new PropertyValueFactory<Eventi, Integer>("id"));
        col_Nome_Evento.setCellValueFactory(new PropertyValueFactory<Eventi, String>("name"));
        col_Data_Evento.setCellValueFactory(new PropertyValueFactory<Eventi, LocalDate>("date"));
        
        view_Evento.getItems().setAll(EventList);
    }

    @FXML
    private void addNewEvent() throws IOException {
        EventList.add(new Eventi(Integer.parseInt(text_Id_Evento.getText()), text_Nome_Evento.getText(), picker_Data_Evento.getValue()));
    }
    
    @FXML
    private void refreshEvent() throws IOException {
        view_Evento.getItems().setAll(EventList);
    }

}

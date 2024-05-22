package com.example.lab13practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    Button Login;
    @FXML
    Button Register;
    //private DatabaseConnection databaseConnection = new DatabaseConnection();
    @FXML
    void handleshowLOGIN(ActionEvent event){
        Parent root;
        try {
            Stage stage= (Stage) Login.getScene().getWindow();
            stage.close();

            root =  FXMLLoader.load(getClass().getResource("login.fxml"));
           // root.setOnScroll(this);
            stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {e.printStackTrace();}

    }
    @FXML
    void handleshowREGISTER(ActionEvent event){
        Parent root;
        try {
            Stage stage= (Stage) Register.getScene().getWindow();
            stage.close();

            root =  FXMLLoader.load(getClass().getResource("register.fxml"));
            // root.setOnScroll(this);
            stage = new Stage();
            stage.setTitle("Register");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {e.printStackTrace();}

    }



}

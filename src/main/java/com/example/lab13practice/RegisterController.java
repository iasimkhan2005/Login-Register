package com.example.lab13practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterController {
    private DatabaseConnection databaseConnection = new DatabaseConnection();
    @FXML
    TextField Username;
    @FXML

    TextField Password;
    @FXML
    void handleRegister(ActionEvent event){
        String username = Username.getText();
        String password = Password.getText();
String query = "INSERT INTO users (username, password) VALUES (?,?);";
        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            showAlert("Register Successful","Welcome " + username);

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}

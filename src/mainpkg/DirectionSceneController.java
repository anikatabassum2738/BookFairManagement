/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anika
 */
public class DirectionSceneController implements Initializable {

    @FXML
    private TextField currentLocationTextField;
    @FXML
    private TextField venueAddressTextField;
    @FXML
    private Button backButton;
    @FXML
    private Label routeLabel;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 
    
    @FXML
    private void calculateRouteButtonOnAction(ActionEvent event) {
    String currentLocation = currentLocationTextField.getText().trim();
    String venueAddress = venueAddressTextField.getText().trim();
    
    if (currentLocation.isEmpty() || venueAddress.isEmpty()) {
        routeLabel.setText("Please enter both a current location and a venue address.");
    } else {
        String suggestedRoute = "Route from " + currentLocation + " to " + venueAddress + " calculated.";
        routeLabel.setText(suggestedRoute);
    }
}

    @FXML
    private void backButtonOnAction(ActionEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AttendeesScene.fxml")); 
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
    }
    }
    
}

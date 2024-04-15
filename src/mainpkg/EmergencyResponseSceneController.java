/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmergencyResponseSceneController {

    @FXML
    private TextField locationTextField;
    @FXML
    private TextField injuredPersonTextField;
    @FXML
    private Button backButton;

    @FXML
    private void coordinateEvacuationButtonOnAction(ActionEvent event) {
        System.out.println("Coordinating evacuation...");
    }

    @FXML
    private void reportInjuryButtonOnAction(ActionEvent event) {
        String location = locationTextField.getText();
        String injuredPerson = injuredPersonTextField.getText();
        System.out.printf("Injury reported for %s at %s.\n", injuredPerson, location);
    }

    @FXML
    private void handleActivateEmergencyAlarm(ActionEvent event) {
        System.out.println("Activating emergency alarm...");
    }

    @FXML
    private void handleNotifyServices(ActionEvent event) {
        System.out.println("Notifying emergency services...");
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecurityPersonnelScene.fxml")); 
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
    }
    }
 }

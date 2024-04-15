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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 */
public class CoordinatinateWithAuthoritiesSceneController implements Initializable {

    @FXML
    private TextField authorityContactField;
    @FXML
    private TextArea informationArea;
    @FXML
    private Button backButton;
    @FXML
    private Button sendInformationButton; 
    @FXML
    private Button requestAssistanceButton;
    @FXML
    private Button updateLogButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    void sendInformationButtonOnAction(ActionEvent event) {
        String contactInfo = authorityContactField.getText();
        String details = informationArea.getText();
        System.out.println("Sending information to: " + contactInfo);
        System.out.println("Details: " + details);
    }

    @FXML
    void requestAssistanceButtonOnAction(ActionEvent event) {
        System.out.println("Requesting immediate assistance...");
    }

    @FXML
    void updateLogButtonOnAction(ActionEvent event) {
        System.out.println("Updating incident log...");
    }

    @FXML
    void backButtonOnAction(ActionEvent event) {
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

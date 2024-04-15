/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anika
 */
public class ReportIncidentSceneController implements Initializable {

    @FXML
    private TextField natureField;
    @FXML
    private TextField locationField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField timeField;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private Label statusLabel;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        statusLabel.setText("");  
    }    

    @FXML
    private void submitButtonOnAction(ActionEvent event) {
        if (validateInput()) {
            String incidentReport = formatReport();
            System.out.println(incidentReport);
            statusLabel.setText("Report submitted successfully.");
        } else {
            statusLabel.setText("Please fill in all fields correctly.");
        }
    }

    private boolean validateInput() {
        return !natureField.getText().trim().isEmpty() &&
               !locationField.getText().trim().isEmpty() &&
               datePicker.getValue() != null &&
               !timeField.getText().trim().isEmpty() &&
               !descriptionArea.getText().trim().isEmpty();
    }

    private String formatReport() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = datePicker.getValue().format(formatter);
        return String.format("Incident Report:\nNature: %s\nLocation: %s\nDate: %s\nTime: %s\nDescription: %s",
                             natureField.getText(), locationField.getText(), dateStr, timeField.getText(), descriptionArea.getText());
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
    
    private void clearForm() {
        natureField.clear();
        locationField.clear();
        datePicker.setValue(null);
        timeField.clear();
        descriptionArea.clear();
    }
}

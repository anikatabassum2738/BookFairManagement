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
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * Anika
 */
public class FeedbackSceneController implements Initializable {

    @FXML
    private Slider experienceSlider;
    @FXML
    private TextArea commentsTextArea;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        experienceSlider.setValue(5); 
    }    

    @FXML
    private void submitFeedback(ActionEvent event) {
        double experienceScore = experienceSlider.getValue();
        String comments = commentsTextArea.getText();
        
        System.out.println("Submitting Feedback:");
        System.out.println("Experience Score: " + experienceScore);
        System.out.println("Comments: " + comments);
        
        showAlert("Feedback Submitted", "Thank you for your feedback!", AlertType.INFORMATION);
        
        experienceSlider.setValue(5);
        commentsTextArea.setText("");
    }

    @FXML
    private void accessFeedbackFormButtonOnAction(ActionEvent event) {
        System.out.println("Accessing the feedback form...");
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
    
    /**
     * Utility method to display alerts.
     */
    private void showAlert(String title, String content, AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

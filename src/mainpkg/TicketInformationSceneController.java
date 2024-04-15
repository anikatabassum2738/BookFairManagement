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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 */
public class TicketInformationSceneController implements Initializable {

    @FXML
    private Button retrieveButton;
    @FXML
    private TextField ticketNumberField;
    @FXML
    private TextArea ticketTypeArea;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     * @param url 
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void retrieveButtonOnAction(ActionEvent event) {
        String ticketNumber = ticketNumberField.getText();
        if (ticketNumber.isEmpty()) {
            ticketTypeArea.setText("Please enter a ticket number.");
        } else {

            ticketTypeArea.setText("Ticket Type: VIP\nValid Until: 31/12/2024");
        }
    }

    @FXML
private void backButtonOnAction(ActionEvent event) {
    try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AttendeesScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RegistrationStatusSceneController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField ticketNumberField;
    @FXML
    private Label statusLabel; 
    @FXML
    private Button backButton;

    private final List<Attendee> registeredAttendees = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Populate the 'database'
        registeredAttendees.add(new Attendee("John Doe", "john@example.com", "12345"));
        registeredAttendees.add(new Attendee("Jane Smith", "jane@sample.com", "67890"));
    }

    @FXML
    private void submitButtonOnAction(ActionEvent event) {
        String name = nameField.getText();
        String email = emailField.getText();
        String ticketNumber = ticketNumberField.getText();

        boolean isRegistered = registeredAttendees.stream()
            .anyMatch(a -> a.getName().equals(name) && a.getEmail().equals(email) && a.getTicketNumber().equals(ticketNumber));

        if (isRegistered) {
            statusLabel.setText("Registration status: Registered");
        } else {
            statusLabel.setText("Registration status: Not Registered");
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
    
    public class Attendee {
    private final String name;
    private final String email;
    private final String ticketNumber;

    public Attendee(String name, String email, String ticketNumber) {
        this.name = name;
        this.email = email;
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }
}

}



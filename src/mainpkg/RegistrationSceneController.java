/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anika
 */
public class RegistrationSceneController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ChoiceBox<String> ticketTypeChoiceBox;
    @FXML
    private Button submitButton;
    @FXML
    private Label confirmationLabel;
    @FXML
    private TableView<Attendee> attendeeTableView;
    @FXML
    private TableColumn<Attendee, String> nameColumn;
    @FXML
    private TableColumn<Attendee, String> emailColumn;
    @FXML
    private TableColumn<Attendee, String> ticketTypeColumn;
    @FXML
    private TableColumn<Attendee, Integer> ticketNoColumn;
    @FXML
    private Button backButton;
    
    private final ObservableList<Attendee> attendeeData = FXCollections.observableArrayList();
    private int ticketNoCounter = 1;


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ticketTypeChoiceBox.setItems(FXCollections.observableArrayList("Standard", "VIP"));
        setupTableView();
    }

    private void setupTableView() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        ticketTypeColumn.setCellValueFactory(new PropertyValueFactory<>("ticketType"));
        ticketNoColumn.setCellValueFactory(new PropertyValueFactory<>("ticketNumber"));
        attendeeTableView.setItems(attendeeData);
    }

    @FXML
    private void submitButtonAction(ActionEvent event) {
         String name = nameField.getText();
        String email = emailField.getText();
        String ticketType = ticketTypeChoiceBox.getValue();
        if (name.isEmpty() || email.isEmpty() || ticketType == null) {
            confirmationLabel.setText("Please fill in all fields!");
            return;
        }
        Attendee newAttendee = new Attendee(name, email, ticketType, ticketNoCounter++);
        attendeeData.add(newAttendee);
        confirmationLabel.setText("Registration successful!");
        clearFields();
    }
    
    private void clearFields() {
        nameField.clear();
        emailField.clear();
        passwordField.clear();
        ticketTypeChoiceBox.setValue(null);
    }


    @FXML
    private void backButtonAction(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/mainpkg/AttendeesScene.fxml")); 
            Scene scene = new Scene(parent);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    public static class Attendee {
        private final String name;
        private final String email;
        private final String ticketType;
        private final int ticketNumber;

        public Attendee(String name, String email, String ticketType, int ticketNumber) {
            this.name = name;
            this.email = email;
            this.ticketType = ticketType;
            this.ticketNumber = ticketNumber;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getTicketType() {
            return ticketType;
        }

        public int getTicketNumber() {
            return ticketNumber;
        }
    }
    }
    


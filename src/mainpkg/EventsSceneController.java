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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class EventsSceneController implements Initializable {

    @FXML
    private ListView<String> eventsListView;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> events = FXCollections.observableArrayList(
            "Author Meet and Greet", "Poetry Reading", "Children's Story Hour"
        );
        eventsListView.setItems(events);
    }    

    @FXML
    private void registerForEventButtonOnAction(ActionEvent event) {
        String selectedEvent = eventsListView.getSelectionModel().getSelectedItem();
        if (selectedEvent != null) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Registration Confirmed");
            alert.setHeaderText(null);
            alert.setContentText("You have registered for: " + selectedEvent);
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select an event to register.");
            alert.showAndWait();
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

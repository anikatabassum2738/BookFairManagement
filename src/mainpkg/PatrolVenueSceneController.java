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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anika
 */
public class PatrolVenueSceneController implements Initializable {

    @FXML
    private ListView<String> logListView;  
    @FXML
    private TextArea observationsTextArea;
    @FXML
    private Button backButton;

    private ObservableList<String> patrolLogs; 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        patrolLogs = FXCollections.observableArrayList();  
        logListView.setItems(patrolLogs);  
    }    

    @FXML
    private void submitReportButtonOnAction(ActionEvent event) {
        String observation = observationsTextArea.getText();  
        if (!observation.isEmpty()) {
            patrolLogs.add(observation);  
            observationsTextArea.clear();  
        }
    }

    @FXML
    private void endPatrolButtonOnAction(ActionEvent event) {
        patrolLogs.add("Patrol ended at " + java.time.LocalTime.now()); 
    }

    @FXML
    private void startPatrolButtonOnAction(ActionEvent event) {
        patrolLogs.add("Patrol started at " + java.time.LocalTime.now());  
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

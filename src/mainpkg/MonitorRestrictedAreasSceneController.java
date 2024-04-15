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
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 */
public class MonitorRestrictedAreasSceneController implements Initializable {

    @FXML
    private ListView<String> accessLogList;
    @FXML
    private Button refreshLogButton;
    @FXML
    private Button reportUnauthorizedAccessButton;
    @FXML
    private Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void refreshLogButtonOnAction(ActionEvent event) {
        System.out.println("Refreshing the access log list...");
    }

    @FXML
    private void reportUnauthorizedAccessButtonOnAction(ActionEvent event) {
        System.out.println("Reporting unauthorized access...");
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

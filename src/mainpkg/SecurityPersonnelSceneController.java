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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anika
 */
public class SecurityPersonnelSceneController implements Initializable {

    @FXML
    private Button verifyTicketsButton;
    @FXML
    private Button patrolVenueButton;
    @FXML
    private Button assistAttendeesButton;
    @FXML
    private Button manageCrowdControlButton;
    @FXML
    private Button emergencyResponseButton;
    @FXML
    private Button coordinateAuthoritiesButton;
    @FXML
    private Button reportIncidentsButton;
    @FXML
    private Button monitorRestrictedAreasButton;
    @FXML
    private Button logOutButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void verifyTicketsButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VerifyTicketScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void patrolVenueButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PatrolVenueScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void assistAttendeesButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AssistAttendeesScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void manageCrowdControlButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ManageCrowdControlScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void emergencyResponseButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmergencyResponseScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void coordinateAuthoritiesButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CoordinateWithAuthoritiesScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void reportIncidentsButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReportIncidentScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void monitorRestrictedAreasButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MonitorRestrictedAreasScene.fxml"));
            Parent registrationRoot = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(registrationRoot);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void logOutButtonOnAction(ActionEvent event) {
      //  Parent scene2Parent = FXMLLoader.load(getClass().getResource("UserType.fxml"));
      //  Scene scene2 = new Scene(scene2Parent);
      // Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();       
      // window.setScene(scene2);
      // window.show(); 
    }
    
}

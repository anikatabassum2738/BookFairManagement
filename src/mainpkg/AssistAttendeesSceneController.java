/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class AssistAttendeesSceneController implements Initializable {

    @FXML
    private ListView<String> inquiryList; 
    @FXML
    private TextArea responseArea;
    @FXML
    private Label statusLabel;
    @FXML
    private Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> inquiries = FXCollections.observableArrayList(
            "Inquiry 1: Where is the registration desk?",
            "Inquiry 2: What time does the event start?",
            "Inquiry 3: Are there any vegetarian food options?"
        );
        inquiryList.setItems(inquiries);
    }    

    @FXML
    private void resolveButtonOnAction(ActionEvent event) {
        final String selectedInquiry = inquiryList.getSelectionModel().getSelectedItem();
        if (selectedInquiry != null && !responseArea.getText().isEmpty()) {
            inquiryList.getItems().remove(selectedInquiry);
            responseArea.clear();
            statusLabel.setText("Inquiry resolved: " + selectedInquiry);
        } else {
            statusLabel.setText("Select an inquiry and provide a response to resolve.");
        }
    }

    @FXML
    private void escalateButtonOnAction(ActionEvent event) {
        final String selectedInquiry = inquiryList.getSelectionModel().getSelectedItem();
        if (selectedInquiry != null) {
            statusLabel.setText("Inquiry escalated to higher authority: " + selectedInquiry);
        } else {
            statusLabel.setText("Select an inquiry to escalate.");
        }
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SecurityPersonnelScene.fxml"));
            Scene securityPersonnelScene = new Scene(loader.load());
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(securityPersonnelScene);
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
            statusLabel.setText("Failed to load main scene.");
        }
    }
}

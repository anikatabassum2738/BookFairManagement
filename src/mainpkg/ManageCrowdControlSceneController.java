/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 */
public class ManageCrowdControlSceneController implements Initializable {

    @FXML
    private Canvas mapCanvas;
    @FXML
    private ListView<String> alertList;
    @FXML
    private TextArea instructionArea;
    @FXML
    private Button backButton;
    @FXML
    private StackPane mapView;

    /**
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setupMap();
        loadInitialAlerts();
    }

    private void setupMap() {
        GraphicsContext gc = mapCanvas.getGraphicsContext2D();
        gc.setFill(javafx.scene.paint.Color.LIGHTGRAY);
        gc.fillRect(0, 0, mapCanvas.getWidth(), mapCanvas.getHeight());
    }

    private void loadInitialAlerts() {
        alertList.getItems().addAll("Alert 1: High traffic in Sector 4", "Alert 2: Queue at Gate B", "Alert 3: Emergency reported near Stage 3");
    }

    @FXML
    private void trafficFlowButtonOnAction() {
        instructionArea.setText("Traffic redirected to support egress from Stage 2.");
    }

    @FXML
    private void queueManagementButtonOnAction() {
        instructionArea.setText("Queues at Entry Gate A are now being managed with additional staff.");
    }

    @FXML
    private void backButtonOnAction() {
    try {
        System.out.println("Loading FXML...");
        URL fxmlUrl = getClass().getResource("SecurityPersonnelScene.fxml");
        if (fxmlUrl == null) {
            throw new RuntimeException("Cannot find FXML file");
        }
        FXMLLoader loader = new FXMLLoader(fxmlUrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } catch (Exception e) {  
        e.printStackTrace(); 
    }
}

       
}

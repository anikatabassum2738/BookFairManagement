/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main application class for the JavaFX program
 */
public class Registration extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file for the Registration scene
            Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/RegistrationScene.fxml"));  // Ensure the path is correctly set

            // Set up the scene
            Scene scene = new Scene(root);

            // Set up the stage
            primaryStage.setTitle("Registration Form");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method to launch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

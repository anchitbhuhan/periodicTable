/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author akshat
 */
public class JavaFXApplication1 extends Application  {
     static Stage primaryStage;
    private static FlowPane mainLayout;
    @Override
    public void start(Stage primaryStage) throws IOException {
        //this.primaryStage=primaryStage;
        //this.mainLayout = mainLayout;
        System.out.println("starting application");
        //Scene scene = new Scene(root,1024, 639);
        primaryStage.setTitle("Periodic Table App");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(JavaFXApplication1.class.getResource("FXMLDocument.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

package com.neoterux.proyecto2p;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * <h1>JavaFX App</h1><p>
 * Proyecto 2do Parcial POO
 * </p>
 * 
 * @author Neoterux
 * @version 0.0.1
 */
public class App extends Application {
    
    private static int WIDTH = 640;
    private static int HEIGHT = 400;

    private static Scene scene;
    public static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {
        /*
            BASE FX APPLICATION
        
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();*/
        
        scene = new Scene(loadFXML("ui/main"));
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setMinWidth(WIDTH);
        stage.setMinHeight(HEIGHT);
        
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
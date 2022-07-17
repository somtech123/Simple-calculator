package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader( App.class.getResource( "mainWindow.fxml" ) );
        Scene scene = new Scene( fxmlLoader.load(), 300, 340 );
        stage.setTitle( "My Calculator" );
        stage.setScene( scene );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
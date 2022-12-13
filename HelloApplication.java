package com.example.Brick_Breaker_Game;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static Stage globalstage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Start-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage = stage;
        stage.setTitle("Welcome to Start Page!");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    public void Onstartbuttonclick() throws IOException {
        //we have to open the game screen
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gamescreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        globalstage.setScene(scene);
        globalstage.setTitle("Welcome to game Screen");
        globalstage.show();
    }
    public static void main(String[] args) {

        launch();
    }
}
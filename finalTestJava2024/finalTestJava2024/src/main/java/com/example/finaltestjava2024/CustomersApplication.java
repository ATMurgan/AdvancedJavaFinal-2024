package com.example.finaltestjava2024;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Andrew Murgan - 200589802
public class CustomersApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CustomersApplication.class.getResource("customersview.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 650);
        stage.setTitle("Customers App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }
}
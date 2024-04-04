package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorld extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloWorld.class.getResource("hello-view.fxml"));

        Label label1 = new Label();
        Label label2 = new Label();
        label1.setText("Hello");
        label2.setText(" World");
        HBox root = new HBox();
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        Scene scene = new Scene(root, 300, 50);
        primarystage.setTitle("JavaFX Example");
        primarystage.setScene(scene);
        primarystage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
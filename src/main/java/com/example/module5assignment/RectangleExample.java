package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleExample.class.getResource("hello-view.fxml"));

       /*

    Group root = new Group();
    primarystage.setTitle("Color Example");
    Rectangle rect = new Rectangle();
    rect.setX(50);
    rect.setY(20);
    rect.setWidth(100);
    rect.setHeight(150);
    int red=20;
    int green=125;
    int blue=10;
    rect.setFill(Color.rgb(red, green, blue,0.63));
    root.getChildren().add(rect);
    Scene scene = new Scene(root,200,200);
    primarystage.setScene(scene);
    primarystage.show();

        */


    }

    public static void main(String[] args) {
        launch();
    }
}
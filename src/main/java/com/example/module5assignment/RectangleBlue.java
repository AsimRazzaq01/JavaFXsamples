package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleBlue extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleBlue.class.getResource("hello-view.fxml"));

        /*

        Group root = new Group();
        Stage primarystage;
        primarystage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(200);
        rect.setHeight(250);
        rect.setEffect(new DropShadow());
        rect.setFill(Color.web("#0000FF",1));
        root.getChildren().add(rect);
        Scene scene = new Scene(root,300,400);
        primarystage.setScene(scene);
        primarystage.show();


         */

    }

    public static void main(String[] args) {
        launch();
    }
}
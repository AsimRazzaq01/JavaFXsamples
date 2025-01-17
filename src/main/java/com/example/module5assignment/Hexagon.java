package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

import java.io.IOException;

public class Hexagon extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Hexagon.class.getResource("hello-view.fxml"));

        Group root = new Group();
        primarystage.setTitle("QuadCurve Example");
        QuadCurve c = new QuadCurve();
        c.setStartX(70);
        c.setStartY(30);
        c.setControlX(250);
        c.setControlY(50);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(250);
        c.setEndY(300);
        root.getChildren().add(c);
        Scene scene = new Scene(root,300,400);
        primarystage.setScene(scene);
        primarystage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
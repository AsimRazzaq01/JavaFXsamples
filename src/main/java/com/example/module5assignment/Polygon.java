package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collection;

public class Polygon extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        //Creating a Polygon
        javafx.scene.shape.Polygon polygon = new javafx.scene.shape.Polygon();
//Adding coordinates to the polygon
        polygon.getPoints().addAll(new Double[]{
                300.0, 50.0,
                450.0, 150.0,
                300.0, 250.0,
                150.0, 150.0,
        });
//Creating a Group object
        Group root = new Group(polygon);
//Creating a scene object
        Scene scene = new Scene(root, 600, 300);
//Setting title to the Stage
        stage.setTitle("Drawing a Polygon");
//Adding scene to the stage
        stage.setScene(scene);
//Displaying the contents of the stage
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    public <E> Collection getPoints() {
        return null;
    }

}
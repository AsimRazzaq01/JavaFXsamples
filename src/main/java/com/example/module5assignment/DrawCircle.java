package com.example.module5assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;


public class DrawCircle extends Application {

    @Override
    public void start(Stage primarystage) throws IOException {

        final double WIDTH = 500.0;
        final double HEIGHT = 500.0;
        final double RADIUS = Math.min(WIDTH, HEIGHT) / 10;
        Pane pane = new Pane();
        pane.setOnMouseClicked(e -> {
            switch (e.getButton()) {
                case PRIMARY:
                    Circle circle = new Circle(e.getX(), e.getY(), RADIUS);
                    circle.setFill(Color.WHITE);
                    circle.setStroke(Color.BLACK);
                    circle.setOnMouseClicked(f -> {
                        pane.getChildren().remove(f.getSource());
                    });
                    pane.getChildren().add(circle);
                    break;
            }
        });
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primarystage.setTitle("java2s.com");
        primarystage.setScene(scene);
        primarystage.show();


    }

    public static void main(String[] args) {
        launch();
    }


}
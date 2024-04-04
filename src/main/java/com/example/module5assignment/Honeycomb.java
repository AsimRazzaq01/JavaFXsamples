package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;

public class Honeycomb extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Honeycomb.class.getResource("hello-view.fxml"));

        /*

        int height = 600;
        int width = 800;
        AnchorPane tileMap = new AnchorPane();
        Scene content = new Scene(tileMap, width, height);
        stage.setScene(content);
        double size = 50,v=Math.sqrt(3)/2.0;
        for(double y=0;y<height;y+=size*Math.sqrt(3))
        {
            for(double x=-25,dy=y;x<width;x+=(3.0/2.0)*size)
            {
                Polygon tile = new Polygon();
                tile.getPoints().addAll(Collections.singleton(new Double[]{
                        x, dy,
                        x + size, dy,
                        x + size * (3.0 / 2.0), dy + size * v,
                        x + size, dy + size * Math.sqrt(3),
                        x, dy + size * Math.sqrt(3),
                        x - (size / 2.0), dy + size * v
                }));
                tile.setFill(Paint.valueOf("#ffffff"));
                tile.setStrokeWidth(2);
                tile.setStroke(Paint.valueOf("#000000") );
                tileMap.getChildren().add(tile);
                dy = dy==y ? dy+size*v : y;
            }
        }
        stage.show();


         */



    }

    public static void main(String[] args) {
        launch();
    }
}
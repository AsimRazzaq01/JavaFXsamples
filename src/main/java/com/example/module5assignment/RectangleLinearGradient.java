package com.example.module5assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleLinearGradient extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleLinearGradient.class.getResource("hello-view.fxml"));

        /*

        VBox root = new VBox();
        final Scene scene = new Scene(root,300, 250);
        Stop[] stops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1,
                Color.BLUE)};
        LinearGradient linear = new LinearGradient(0, 0, 1, 0, true,
                CycleMethod.NO_CYCLE, stops);
        Rectangle rect = new Rectangle(0, 0, 100, 100);
        rect.setFill(linear);
        root.getChildren().add(rect);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation Example");
        primaryStage.show();


         */

    }

    public static void main(String[] args) {
        launch();
    }
}
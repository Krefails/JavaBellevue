package com.bellevue.module8;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class CardsApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));

        File dir = new File("src/main/java/com/bellevue/module8/cards");

        File[] files = dir.listFiles();

        Random rand = new Random();

        File file = files[rand.nextInt(files.length)];
        for (int i = 0; i < 4; i++) {
            Image image = new Image(file.toURI().toString());
            ImageView iv = new ImageView(image);
            iv.setFitHeight(150);
            iv.setFitWidth(100);
            file = files[rand.nextInt(files.length)];
            pane.getChildren().add(iv);
        }

        Scene scene = new Scene(pane, 595, 370);
        stage.setTitle("Displaying Cards");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
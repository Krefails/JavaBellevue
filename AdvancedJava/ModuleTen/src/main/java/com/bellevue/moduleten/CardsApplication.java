package com.bellevue.moduleten;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static com.bellevue.moduleten.RandomCards.getCards2;

public class CardsApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Random rand = new Random();
        File cardDir = new File("src/main/java/com/bellevue/moduleten/cards");
        File refreshImgUrl = new File("src/main/java/com/bellevue/moduleten/refreshImage/Button-Refresh.png");

        File[] cards = cardDir.listFiles();

        ImageView refreshImageView = new ImageView();
        Image refreshImage = new Image(refreshImgUrl.toURI().toString());
        refreshImageView.setImage(refreshImage);
        refreshImageView.setFitHeight(50);
        refreshImageView.setFitWidth(50);
        Button refreshBtn = new Button("", refreshImageView);

        assert cards != null;
        getCards2(pane, rand, cards);

        refreshBtn.setOnAction(actionEvent -> {
            pane.getChildren().clear();
            getCards2(pane, rand, cards);
            pane.getChildren().add(refreshBtn);
        });
        pane.getChildren().add(refreshBtn);

        Scene scene = new Scene(pane, 595, 370);
        stage.setTitle("Displaying Cards");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
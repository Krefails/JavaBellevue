package com.bellevue.moduleten;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.Random;

public class RandomCards {
    static void getCards2(Pane pane, Random rand, File[] files) {
        File file = files[rand.nextInt(files.length)];

        for (int i = 0; i < 4; i++) {
            Image card = new Image(file.toURI().toString());
            ImageView iv = new ImageView(card);
            iv.setFitHeight(150);
            iv.setFitWidth(100);
            file = files[rand.nextInt(files.length)];
            pane.getChildren().add(iv);
        }
    }
}

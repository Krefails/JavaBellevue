/**
 * Justin Kreifels
 * 2022-06-12
 * This program displays either a rectangle, circle, or ellipse depending on the users' selection
 * Then the user has the option to clear the color of the selected shape, or fill it with a random color.
 * */

package com.bellevue.moduleeleven;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Shapes extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 595, 370);
        Pane pane = new HBox(10);
        GridPane checkboxes = new GridPane();

        Rectangle rect = new Rectangle();
        Circle circ = new Circle();
        Ellipse elliptic = new Ellipse();

        CheckBox rectangle = new CheckBox("Rectangle");
        CheckBox circle = new CheckBox("Circle");
        CheckBox ellipse = new CheckBox("Ellipse");
        CheckBox clear = new CheckBox("Clear Shapes");
        CheckBox fill = new CheckBox("Fill Shapes With Random Color");

        rect.setWidth(100);
        rect.setHeight(100);
        circ.setRadius(50);
        elliptic.setRadiusX(100);
        elliptic.setRadiusY(50);

        checkboxes.setHgap(10);
        checkboxes.setVgap(10);

        rectangle.setOnAction(actionEvent -> {
            if(checkBoxAction(rectangle, circle, ellipse)) return;
            pane.getChildren().clear();
            pane.getChildren().add(rect);
        });

        circle.setOnAction(actionEvent -> {
            if(checkBoxAction(circle, rectangle, ellipse)) return;
            pane.getChildren().clear();
            pane.getChildren().add(circ);
        });

        ellipse.setOnAction(actionEvent -> {
            if(checkBoxAction(ellipse, circle, rectangle)) return;
            pane.getChildren().clear();
            pane.getChildren().add(elliptic);
        });

        clear.setOnAction(actionEvent -> {
            if(checkBoxAction(clear, fill)) return;
            rect.setFill(Color.WHITE);
            circ.setFill(Color.WHITE);
            elliptic.setFill(Color.WHITE);
        });

        fill.setOnAction(actionEvent -> {
            if(checkBoxAction(fill, clear)) return;
            rect.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            circ.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            elliptic.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        });

        checkboxes.add(rectangle, 0, 0, 4, 4);
        checkboxes.add(circle, 4, 0, 4, 4);
        checkboxes.add(ellipse, 8, 0, 4, 4);
        checkboxes.add(clear, 0, 5, 4, 4);
        checkboxes.add(fill, 5, 5, 4, 4);

        root.setSpacing(10);
        root.setPadding(new Insets(0, 20, 10, 20));
        root.getChildren().addAll(pane, checkboxes);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static boolean checkBoxAction(CheckBox checkOne, CheckBox checkTwo, CheckBox checkThree) {
        if (checkTwo.isSelected()) return true;
        if (checkThree.isSelected()) return true;
        return !checkOne.isSelected();
    }

    public static boolean checkBoxAction(CheckBox checkOne, CheckBox checkTwo) {
        if (checkTwo.isSelected()) return true;
        return !checkOne.isSelected();
    }


    public static void main(String[] args) {
        launch();
    }
}

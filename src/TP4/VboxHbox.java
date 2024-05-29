package TP4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class VboxHbox extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("un test");

        Label label1 = new Label("label1");
        Label label2 = new Label("label2");
        Label label3 = new Label("label3");


        Rectangle redLine = new Rectangle();
        redLine.setWidth(20);
        redLine.setHeight(2);
        redLine.setFill(Color.RED);

        Rectangle blueLine = new Rectangle();
        blueLine.setWidth(2);
        blueLine.setHeight(20);
        blueLine.setFill(Color.BLUE);

        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        hbox.getChildren().addAll(label1, redLine, label2);

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().addAll(hbox, blueLine, label3);

        Scene scene = new Scene(vbox, 300, 200); // ???????300x200

        primaryStage.setScene(scene); // ?????????
        primaryStage.show(); // ????
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

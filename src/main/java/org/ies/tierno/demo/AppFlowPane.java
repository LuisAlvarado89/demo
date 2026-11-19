package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AppFlowPane extends Application {

    private static Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();


        Button[] btn = new Button[10];

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new Button("Botón nº" + (i + 1));
            root.getChildren().add(btn[i]);
        }
        root.getChildren().add(new Button("Este boton es extremadamente largo"));


        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        root.setOrientation(Orientation.VERTICAL);

        scene = new Scene(root, 500, 300);

        primaryStage.setScene(scene);

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();

    }
}

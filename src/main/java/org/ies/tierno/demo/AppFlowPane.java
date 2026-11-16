package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class AppFlowPane extends Application {

    private static Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        Button button1 = new Button("Boton 1");
        Button button2 = new Button("Boton 2");
        Button button3 = new Button("Boton 3");
        Button button4 = new Button("Boton 4");
        Button button5 = new Button("Boton 5");
        Button button6 = new Button("Boton 6");

        List<Button> buttons = new ArrayList<>(10);

        root.getChildren().addAll(buttons);


        root.getChildren().addAll(button1, button2, button3, button4, button5, button6);

        root.setHgap(10);
        root.setVgap(10);
        root.setOrientation(Orientation.VERTICAL);

        scene = new Scene(root, 500, 300);

        primaryStage.setScene(scene);

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();

    }
}

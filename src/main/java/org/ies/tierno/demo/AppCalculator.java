package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class AppCalculator extends Application {

    double number;
    String operacion = "";

    @Override
    public void start(Stage primaryStage) {

        // Pantalla de la calculadora
        TextField screen = new TextField("2");
        screen.setAlignment(Pos.CENTER_RIGHT);
        screen.setMaxWidth(Double.MAX_VALUE);


        // Crear la cuadrícula
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);


        // Números y operaciones
        String[] numbers = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "X",
                "C", "0", "=", "/"
        };

        // Colocar la pantalla ocupando las cuatro columnas
        root.add(screen, 0, 0, 4, 1);


        // Crear los botones
        Button[] btn = new Button[16];
        int colum = 0;
        int fila = 1;

        for (int i = 0; i < numbers.length; i++) {

            btn[i] = new Button(numbers[i]);
            btn[i].prefWidth(60);
            btn[i].setMaxWidth(Double.MAX_VALUE);


            // Colocar los botones en la cuadrícula
            root.add(btn[i], colum, fila);
            colum++;

            if (colum == 4) {
                colum = 0;
                fila++;
            }

        }

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Calculadora JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
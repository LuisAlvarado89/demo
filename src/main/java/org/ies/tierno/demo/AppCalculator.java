package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppCalculator extends Application {

    double number;
    String operacion = "";

    @Override
    public void start(Stage primaryStage) {

        // Pantalla de la calculadora
        TextField screen = new TextField();
        screen.setEditable(false);
        screen.setText("0");

        // Números y operaciones
        String[] numbers = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "X",
                "C", "0", "=", "/"
        };

        // Crear la cuadrícula
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Margen de la pantalla
        GridPane.setMargin(screen, new Insets(5, 40, 5, 30));

        // Colocar la pantalla ocupando las cuatro columnas
        grid.add(screen, 0, 0, 4, 1);

        // Crear los botones
        Button[] btn = new Button[16];

        for (int i = 0; i < numbers.length; i++) {

            btn[i] = new Button(numbers[i]);
            btn[i].setPrefSize(100, 40);

            // Margen de cada botón
            GridPane.setMargin(btn[i], new Insets(0, 5, 0, 5));

            // Colocar los botones en la cuadrícula
            grid.add(btn[i], i % 4, (i / 4) + 1);
        }

        // Añadir la cuadrícula a la ventana
        VBox root = new VBox(20);
        root.getChildren().add(grid);

        Scene scene = new Scene(root, 450, 300);

        primaryStage.setTitle("Calculadora JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
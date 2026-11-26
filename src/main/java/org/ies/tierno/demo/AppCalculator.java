package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class AppCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Contenedor
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(15));

        //Columnas
        for (int i = 0; i < 4; i++) {
            ColumnConstraints col = new ColumnConstraints();
            col.setPercentWidth(25);
            col.setHgrow(Priority.ALWAYS);
            root.getColumnConstraints().add(col);
        }

        // Reparte altura de ventana entre las filas de la cuadricula
        for (int i = 0; i < 5; i++) {
            RowConstraints row = new RowConstraints();
            row.setPercentHeight(18);
            root.getRowConstraints().add(row);
        }

        //Pantalla de la calculadora
        TextField screen = new TextField("2");
        screen.setAlignment(Pos.CENTER_RIGHT);
        screen.setMaxWidth(Double.MAX_VALUE);
        screen.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        GridPane.setMargin(screen,new Insets(0,0,20,0));


        root.add(screen, 0, 0, 4, 1);

        String[] numbers = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "X",
                "C", "0", "=", "/"
        };

        Button[] btn = new Button[16];
        int colum = 0;
        int fila = 1;

        for (int i = 0; i < numbers.length; i++) {
            btn[i] = new Button(numbers[i]);

            btn[i].setMaxWidth(Double.MAX_VALUE);
            btn[i].setMaxHeight(Double.MAX_VALUE);


            root.add(btn[i], colum, fila);

            colum++;
            if (colum == 4) {
                colum = 0;
                fila++;
            }
        }

        Scene scene = new Scene(root, 300, 380);
        primaryStage.setTitle("JavaFX Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;



public class AppAnchorPane extends Application {

    @Override
    public void start(Stage stage) {

        // Panel principal
        AnchorPane panel = new AnchorPane();

        panel.setStyle("-fx-background-color: #CFA879;");

        // Barra verde superior
        Region barraVerde = new Region();
        barraVerde.setPrefHeight(34);
        barraVerde.setStyle("-fx-background-color: #6C9B59;");

        AnchorPane.setTopAnchor(barraVerde, 0.0);
        AnchorPane.setLeftAnchor(barraVerde, 0.0);
        AnchorPane.setRightAnchor(barraVerde, 0.0);

        // Rectángulo turquesa
        Region rectanguloTurquesa = new Region();
        rectanguloTurquesa.setPrefHeight(64);
        rectanguloTurquesa.setStyle("-fx-background-color: #4CC4AF;");

        AnchorPane.setTopAnchor(rectanguloTurquesa, 34.0);
        AnchorPane.setLeftAnchor(rectanguloTurquesa, 0.0);
        AnchorPane.setRightAnchor(rectanguloTurquesa, 85.0);

        // Rectángulo azul inferior
        Region rectanguloAzul = new Region();
        rectanguloAzul.setPrefSize(73, 25);
        rectanguloAzul.setStyle("-fx-background-color: #529DD1;");

        AnchorPane.setBottomAnchor(rectanguloAzul, 0.0);
        AnchorPane.setLeftAnchor(rectanguloAzul, 50.0);

        // Añadir elementos
        panel.getChildren().addAll(
                barraVerde,
                rectanguloTurquesa,
                rectanguloAzul
        );

        // Escena
        Scene scene = new Scene(panel, 470, 286);

        stage.setTitle("Tarea 9 - AnchorPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
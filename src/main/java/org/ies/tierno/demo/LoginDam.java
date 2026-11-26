package org.ies.tierno.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginDam extends Application {

    private static Scene scene;


    @Override
    public void start(Stage primaryStage) throws IOException{

        Label login = new Label("LOGIN DAM");
        login.setFont(new Font("Arial", 20));

        Label user = new Label("Usuario");
        TextField textFiled = new TextField();

        Label password = new Label("Contraseña");
        PasswordField passwordField = new PasswordField();

        Button enter = new Button("Entrar");

        Button exit = new Button("Salir");


        VBox root = new VBox();

        List<Node> nodes = new ArrayList<>();

        nodes.add(login);
        nodes.add(user);
        nodes.add(textFiled);
        nodes.add(password);
        nodes.add(passwordField);


        HBox buttons = new HBox(20);
        buttons.getChildren().addAll(enter, exit);

        nodes.add(buttons);


        root.getChildren().addAll(nodes);

        root.setAlignment(Pos.CENTER);
        buttons.setAlignment(Pos.CENTER);

        VBox.setMargin(textFiled, new Insets(5, 30, 5, 30));
        VBox.setMargin(passwordField, new Insets(5, 30, 5, 30));
        VBox.setMargin(login, new Insets(0, 0, 50, 0));

        scene = new Scene(root, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login JavaFX de Luis");

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}

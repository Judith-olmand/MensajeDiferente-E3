package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.awt.*;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hola JavaFX"); //Mensaje en la misma ventana

        Button button = new Button("Cambiar mensaje"); //Crea un botón con ese mensaje

        //Acción al pulsar el botón
            //Cambia el mensaje inicial
        button.setOnAction(event -> label.setText("Adios JavaFX"));

        //Crea una caja vertical de 10pixel
        VBox vbox = new VBox(10);
        //Llena la caja con el mensaje y el botón
        vbox.getChildren().addAll(label,button);

        //Crea una "escena" o ventana de 400x200px con la caja anterior dentro
        Scene scene = new Scene(vbox, 400, 200);
        //Titulo de la "escena" o ventana
        primaryStage.setTitle("Clic en botón cambia mensaje inicial, Ejercicio 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
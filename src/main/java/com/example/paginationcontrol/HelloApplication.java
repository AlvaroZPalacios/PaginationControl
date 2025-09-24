package com.example.paginationcontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Pagination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Pagination pagination;

    public static void main(String[] args) throws Exception {
        launch (args);
    }

    public VBox createPage(int numeroPagina)
    {
        VBox libro = new VBox(5);
        VBox pagina = new VBox();
        Hyperlink palabra1 = new Hyperlink("Palabra 1");
        Hyperlink palabra2 = new Hyperlink("Palabra 2");
        Hyperlink palabra3 = new Hyperlink("Palabra 3");
        Hyperlink palabra4 = new Hyperlink("Palabra 4");
        Hyperlink palabra5 = new Hyperlink("Palabra 5");

        pagina.getChildren().add(palabra1);
        pagina.getChildren().add(palabra2);
        pagina.getChildren().add(palabra3);
        pagina.getChildren().add(palabra4);
        pagina.getChildren().add(palabra5);
        libro.getChildren().add(pagina);
        return libro;
    }
    @Override
    public void start(final Stage stage) throws IOException {
        pagination = new Pagination(5,0);
        pagination.setStyle("-fx-border-color: #0055d7;");
        pagination.setPageFactory((Integer numeroPagina) -> createPage(numeroPagina));
        AnchorPane anchor = new AnchorPane();
        AnchorPane.setTopAnchor(pagination, 10.0);
        AnchorPane.setRightAnchor(pagination, 10.0);
        AnchorPane.setBottomAnchor(pagination, 10.0);
        AnchorPane.setLeftAnchor(pagination, 10.0);
        anchor.getChildren().add(pagination);
        Scene scene = new Scene(anchor);
        stage.setScene(scene);
        stage.setTitle("Prueba de Pagination Control");
        stage.show();
    }
}

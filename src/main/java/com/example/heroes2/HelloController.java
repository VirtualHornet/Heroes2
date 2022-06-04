package com.example.heroes2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;


public class HelloController implements Initializable {

    private Stage stage;
    private Scene scene;


    @FXML
    AnchorPane background;

    /**************************************************************
     A kezdőképernyő beállítása
     **************************************************************/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Image myImage = new Image(getClass().getResourceAsStream("backgorund.jpg"));
        ImageView kep = new ImageView(myImage);
        kep.setFitWidth(900);
        kep.setFitHeight(800);
        background.getChildren().add(kep);

    }
    /**************************************************************
     A kilépés gomb
     **************************************************************/

    public void butExitClicked() {
        System.exit(0);
    }
    /**************************************************************
     Váltás a második Scenere
     **************************************************************/

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Fight.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
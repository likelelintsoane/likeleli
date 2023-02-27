package com.mycompany.mavenproject41;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class SecondaryController {
     @FXML
    private ToggleGroup box;

    @FXML
    private RadioButton chad;

    @FXML
    private RadioButton clear;
    @FXML
    private RadioButton exit;

    @FXML
    private TextField first;

    @FXML
    private RadioButton france;

    @FXML
    private RadioButton ireland;

    @FXML
    private RadioButton italy;

    @FXML
    private RadioButton mexico;

    @FXML
    private Text names;

    @FXML
    private TextField second;

    @FXML
    private TextField third;
    

    @FXML
    void chadA(ActionEvent event) {
        first.setStyle("-fx-background-color: blue;");
        second.setStyle("-fx-background-color: yellow;");
        third.setStyle("-fx-background-color: red;");
        names.setText("CHAD");
    }

    @FXML
    void franceB(ActionEvent event) {
        first.setStyle("-fx-background-color: darkblue;");
        second.setStyle("-fx-background-color: white;");
        third.setStyle("-fx-background-color: red;");
        names.setText("FRANCE");
    }

    @FXML
    void irelandB(ActionEvent event) {
        first.setStyle("-fx-background-color: green;");
        second.setStyle("-fx-background-color: white;");
        third.setStyle("-fx-background-color: orange;");
        names.setText("IRELAND");
    }

    @FXML
    void italyB(ActionEvent event) {
        first.setStyle("-fx-background-color: green;");
        second.setStyle("-fx-background-color: white;");
        third.setStyle("-fx-background-color: red;");
        names.setText("ITALY");
    }

    @FXML
    void mexicoB(ActionEvent event) {
        first.setStyle("-fx-background-color: green;");
        second.setStyle("-fx-background-color: white;");
        third.setStyle("-fx-background-color: red;");
        names.setText("MEXICO");
    }
    
    @FXML
    void clearB(ActionEvent event) {
        first.setStyle("-fx-background-color: ;");
        second.setStyle("-fx-background-color: ;");
        third.setStyle("-fx-background-color: ;");
        names.setText("HOME");
    }
    
    @FXML
    void exitB(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

//    @FXML
//    private void switchToPrimary() throws IOException {
//        App.setRoot("primary");
//    }


}
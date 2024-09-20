package com.samu.ex4;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SecondaryController {

    @FXML
    private ListView<String> list;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    public void initialize() {
        list.getItems().addAll("Test");
    }

    @FXML
    private void quit() {
        Platform.exit();
    }

}
package com.samu.ex4;

import java.io.IOException;
import java.util.Random;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

public class PrimaryController {

    @FXML
    private ComboBox<String> timeSelect;

    @FXML
    private ComboBox<String> groupSelect;

    @FXML
    private LineChart<String, Number> lineChart;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    public void initialize() {
        timeSelect.getItems().addAll("Today", "This week", "Last week", "Last month");
        groupSelect.getItems().addAll("My group");
    }

    @FXML
    private void showData() {
        lineChart.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("sumthing");

        Random random = new Random();
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // Generate random data for each day
        for (String day : days) {
            int randomValue = random.nextInt(50); // Generate a random number between 0 and 49
            series.getData().add(new XYChart.Data<>(day, randomValue));
        }
        lineChart.getData().add(series);
    }

    @FXML
    private void quit() {
        Platform.exit();
    }

}

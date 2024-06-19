package com.example.temperatureconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TempConvController {

    @FXML
    private TextField temperatureInput;

    @FXML
    private Label resultLabel;

    @FXML
    protected void convertToFahrenheit() {
        try {
            double celsius = Double.parseDouble(temperatureInput.getText());
            double fahrenheit = (celsius * 9/5) + 32;
            resultLabel.setText(String.format("%.2f °C = %.2f °F", celsius, fahrenheit));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input! Please enter a valid number.");
        }
    }

    @FXML
    protected void convertToCelsius() {
        try {
            double fahrenheit = Double.parseDouble(temperatureInput.getText());
            double celsius = (fahrenheit - 32) * 5/9;
            resultLabel.setText(String.format("%.2f °F = %.2f °C", fahrenheit, celsius));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input! Please enter a valid number.");
        }
    }
}

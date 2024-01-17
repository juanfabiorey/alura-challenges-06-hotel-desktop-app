package com.hotelalura;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControladorSaludar {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("¡Hola! bienvenidos a JavaFX");
    }
}
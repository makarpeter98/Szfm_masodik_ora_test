package org.example.szfm_harmadik_ora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    Integer myNumber = 0;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onPushMeButton(ActionEvent actionEvent) {

        welcomeText.setText(myNumber.toString());
        myNumber++;

    }
}

package org.example.szfm_harmadik_ora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    private Integer counter = 0;

    @FXML
    private Label counterLabel;

    public void onPushMeButton(ActionEvent actionEvent) {
        counter++;
        counterLabel.setText(counter.toString());
        System.out.println("Counter értéke: " + counter);
    }
}

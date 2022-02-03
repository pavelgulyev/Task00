package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class Controller {
    @FXML

    private Label label1;

    public void onStart(ActionEvent actionEvent) {
        label1.setText("Вы нажали на кнопку");
    }
}

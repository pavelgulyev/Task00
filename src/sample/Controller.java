package sample;

import Model.Procent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
public class Controller {
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private TextField Summ;
    private static final int pr  = 12;

    Procent procent = new Procent();
    public void onStart(ActionEvent actionEvent) {
        Label1.setText(procent.countPr(Double.parseDouble(Summ.getText()),pr)+"");
    }

    public void onXorosho(ActionEvent actionEvent) {
        Label2.setText(procent.countSum(Double.parseDouble(Summ.getText()),pr) + "");
    }

    public void onZamechatelino(ActionEvent actionEvent) {
        Label3.setText(procent.countSumTrunc(Double.parseDouble(Summ.getText()),pr) + "");
    }
}

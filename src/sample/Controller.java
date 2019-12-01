package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML public TextField message;
    @FXML public Button btnSend;
    @FXML public TextArea chat;

    public void menuOnActionExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void btnSendOnAction(ActionEvent actionEvent) {
        chat.appendText(message.getText() + "\n");
        message.clear();
        message.requestFocus();
    }
}

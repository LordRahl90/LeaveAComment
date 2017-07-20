package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField fullname;

    @FXML
    private TextArea comment;

    @FXML
    private Text lblResponse;

    @FXML
    public void sendComment() {
        String userFullname = fullname.getText();
        String userComment = comment.getText();

        lblResponse.setText(userFullname+" "+userComment);

        System.out.println(userFullname + ", " + userComment);
    }


    @FXML
    public void clearComments() {
        fullname.setText("");
        comment.setText("");
        lblResponse.setText("");
    }
}

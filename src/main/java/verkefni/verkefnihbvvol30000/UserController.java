package verkefni.verkefnihbvvol30000;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class UserController {

    @FXML
    private TextField fxUsername, fxEmail;
    @FXML
    private PasswordField fxPassword;
    @FXML
    private Button loginOrSignup;

    public void signupOrLoginHandler(ActionEvent event){
        ViewSwitcher.switchTo(View.HOTEL);

    }



}


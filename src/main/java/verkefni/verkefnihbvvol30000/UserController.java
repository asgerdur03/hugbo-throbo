package verkefni.verkefnihbvvol30000;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

public class UserController {

    @FXML
    private TextField fxUsername, fxEmail;
    @FXML
    private PasswordField fxPassword;
    @FXML
    private Button fxLogin, fxSignup;

    public void loginHandler(ActionEvent event){
        ViewSwitcher.switchTo(View.HOTEL);
    }
    public void signupHandler(ActionEvent event){
        ViewSwitcher.switchTo(View.HOTEL);
    }



}


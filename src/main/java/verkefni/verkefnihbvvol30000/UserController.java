package verkefni.verkefnihbvvol30000;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UserController implements Initializable { //semi funtional, ásættanlegt en ekki fullkomið.

    @FXML
    private TextField fxUsername, fxEmail;
    @FXML
    private PasswordField fxPassword;
    @FXML
    private Label fxLoginText, fxSignupText;


    public UserDB userDB = new UserDB();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void loginHandler(ActionEvent event) {  //EKKI BREYTA
        /*




        try {
            if (userDB.islogin(fxUsername.getText(), fxPassword.getText())) {
                fxLoginText.setText("Login successful");
            } else {
                fxLoginText.setText("Login failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } */

    }

    public void goBack(ActionEvent event) {
        ViewSwitcher.switchTo(View.HOTEL);
    }

    public void signupHandler(ActionEvent event) { // EKKI BREYTA
        /*
        try {
            userDB.DBsignup(fxUsername.getText(), fxEmail.getText(), fxPassword.getText());
            fxSignupText.setText("Signup successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }

         */


    }
}


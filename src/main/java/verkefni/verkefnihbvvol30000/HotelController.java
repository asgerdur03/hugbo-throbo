package verkefni.verkefnihbvvol30000;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HotelController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
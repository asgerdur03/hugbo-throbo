package verkefni.verkefnihbvvol30000;

import javafx.application.Platform;
import javafx.scene.control.Alert;

/**
 * @author Ásgerður Júlía Gunnarsdóttir
 * @gmail ajg20@hi.is
 */

public class StadfestingDialog {
    /**
     * Býr til nýtt AlertDialog sem segir að pöntun sé staðfest
     */
    public StadfestingDialog() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Staðfesting");
        alert.setHeaderText("Staðfesting á bókun");
        String s = "Bókunin þín hefur verið staðfest, tölvupóstur verður sentur innan skamms.";
        alert.setContentText(s);
        alert.setContentText(s);

// Set action for when the OK button is clicked
        alert.setOnCloseRequest(event -> {
            // Terminate the program
            Platform.exit();
        });

        alert.showAndWait();
    }


}

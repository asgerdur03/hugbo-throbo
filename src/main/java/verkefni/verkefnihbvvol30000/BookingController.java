package verkefni.verkefnihbvvol30000;

import javafx.fxml.FXML;
import verkefni.verkefnihbvvol30000.StadfestingDialog;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

public class BookingController {

    @FXML
    public void backToBooking(){
        ViewSwitcher.switchTo(View.HOTEL);
        // move to hotel-view
    }
    @FXML
    public void payAndFinish(){
        new StadfestingDialog();
        // finish, mabey open dialog window?
    }

}

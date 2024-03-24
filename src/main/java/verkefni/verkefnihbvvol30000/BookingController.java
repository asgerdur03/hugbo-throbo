package verkefni.verkefnihbvvol30000;

import javafx.fxml.FXML;
import verkefni.verkefnihbvvol30000.StadfestingDialog;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

public class BookingController { //allt sem er hægt að gera eftir á

    // TODO: display booking details (prize, date, etc)


    @FXML
    public void backToBooking(){
        ViewSwitcher.switchTo(View.HOTEL);
        // move to hotel-view
    }
    @FXML
    public void payAndFinish(Booking booking) {
        // remove booking() from DB
        new StadfestingDialog();

    }

    public void addBooking(Booking booking) {
    }

    public void removeBooking(Booking booking) {

    }
}

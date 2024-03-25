package verkefni.verkefnihbvvol30000;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import verkefni.verkefnihbvvol30000.StadfestingDialog;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.SimpleTimeZone;

public class BookingController {
    private MockDB mockDB = new MockDB() ; //allt sem er hægt að gera eftir á

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
        mockDB.addBooking(booking);
    }

    public void removeBooking(Booking booking) {
        mockDB.removeBooking(booking);

    }

    public ArrayList<Booking> searchBookings(String name ){
        ArrayList<Booking> foundBookings = new ArrayList<>();
        for (Booking booking : mockDB.getBookings()) {
            if (booking.getUserName().equals(name)) {
                foundBookings.add(booking);
            }
        }
        return foundBookings;
    }

    public ArrayList<Booking> getBookings() {
        return mockDB.getBookings();
    }

    public void payAndFinish(ActionEvent event) {
    }
}

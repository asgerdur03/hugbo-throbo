package verkefni.verkefnihbvvol30000;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

public class HotelController {

    private Hotel hotel;
    private ArrayList<Room> rooms;

    @FXML
    private Button bookAndPay;
    @FXML
    private ListView<Room> fxRooms;
    @FXML
    private DatePicker fxStart, fxEnd;


    @FXML
    public void bookAndPay(){
        ViewSwitcher.switchTo(View.BOOKING);
        // move to booking-view

    }

    @FXML
    public void logUpButton(){
        ViewSwitcher.switchTo(View.USER);
        // move to user-view

    }
    public void addRoom(){

    }
    public void removeRoom(){

    }
}

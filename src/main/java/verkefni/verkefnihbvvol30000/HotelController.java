package verkefni.verkefnihbvvol30000;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import verkefni.verkefnihbvvol30000.Hotel;
import verkefni.verkefnihbvvol30000.Room;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;


public class HotelController {

    private Hotel hotel;
    private HotelDB db;
    private ArrayList<Room> rooms;

    @FXML
    private Button bookAndPay;
    @FXML
    private ListView<Room> fxRooms;
    @FXML
    private DatePicker fxStart, fxEnd;

    MockDB mockDB = new MockDB();

    public HotelController(){db=new HotelDB();}
    @FXML
    public void bookAndPay(){
        ViewSwitcher.switchTo(View.BOOKING);
        // move to booking-view

    }

    @FXML
    public void loginButton(){
        ViewSwitcher.switchTo(View.LOGIN);
        // move to user-view
    }
    @FXML
    public void signUpButton(){
        ViewSwitcher.switchTo(View.SIGNUP);
        // move to user-view

    }
    public void addRoom(Room room){
        mockDB.addRoom(room);

    }
    public void removeRoom(){ //sleppa?


    }

    public ArrayList<Room> getAvailableRooms() {
        return rooms;
    }
}

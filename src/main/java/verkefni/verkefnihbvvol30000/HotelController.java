package verkefni.verkefnihbvvol30000;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import verkefni.verkefnihbvvol30000.Hotel;
import verkefni.verkefnihbvvol30000.Room;
import verkefni.verkefnihbvvol30000.View;
import verkefni.verkefnihbvvol30000.ViewSwitcher;

import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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
    @FXML
    private TextField searchBar;

    MockDB mockDB = new MockDB();

    public HotelController() {
        db = new HotelDB();
    }

    @FXML
    public void bookAndPay() {
        ViewSwitcher.switchTo(View.BOOKING);
        // move to booking-view

    }

    @FXML
    public void loginButton() {
        ViewSwitcher.switchTo(View.LOGIN);
        // move to user-view
    }

    @FXML
    public void signUpButton() {
        ViewSwitcher.switchTo(View.SIGNUP);
        // move to user-view

    }

    public void addRoom(Room room) {
        mockDB.addRoom(room);

    }

    public void addRoom(ActionEvent event) {
    }

    public void removeRoom() { //sleppa?

    }

    public ArrayList<Room> getAvailableRooms() {
        return rooms;
    }

   @FXML
    private void initialize() {

        rooms = db.getAvailableRooms();
        updateRoomListView(rooms);

        searchBar.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.isEmpty()) {
                filterAndDisplayRooms(newValue);
            } else {
                updateRoomListView(rooms);
            }
        });
    }

    private void updateRoomListView(List<Room> rooms) {
        if (rooms != null) {
            ObservableList<Room> roomList = FXCollections.observableArrayList(rooms);
            fxRooms.setItems(roomList);
        } else {
            System.out.println("Not found");
        }
    }

    private void filterAndDisplayRooms(String searchText) {
        List<Room> filteredRooms = rooms.stream()
                .filter(room -> roomContainsText(room, searchText))
                .collect(Collectors.toList());

        updateRoomListView(filteredRooms);
    }

    private boolean roomContainsText(Room room, String searchText) {
        return room.getName().toLowerCase().contains(searchText.toLowerCase());
    }
}

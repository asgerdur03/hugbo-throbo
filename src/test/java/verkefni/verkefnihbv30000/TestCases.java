package verkefni.verkefnihbv30000;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import verkefni.verkefnihbvvol30000.*;

import java.util.ArrayList;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class TestCases {

    private UserController userController;
    private HotelController hotelController;
    private BookingController bookingController;
    private MockDB mockDB;


    @Before
    public void setUp() {
        mockDB = new MockDB();
        userController = new UserController();
        hotelController = new HotelController();
        bookingController = new BookingController();
    }

    @After
    public void tearDown() {
        userController = null;
        hotelController = null;
        bookingController = null;
    }
    @Test
    public void testGetAvailableRooms1() {
        ArrayList<Room> rooms = mockDB.getAvailableRooms();

        assertEquals(rooms.size(), 6);
    }
    @Test
    public void testGetAvailableRooms2() {
        ArrayList<Room> rooms2 = new ArrayList<>();
        ArrayList<Hotel> x = new ArrayList<>();
        x.add(new Hotel("Hotel xx", "Hafnarfjordur"));

        rooms2.add(new Room(x.get(0), 2, true, 100));

        assertEquals(rooms2.size(), 1);
    }

    @Test
    public void testSearchHotel() {
        ArrayList<Hotel> foundHotels = mockDB.searchHotel("Hotel HBV", "Hafnarfjordur");
        assertEquals(foundHotels.size(), 1);
    }
    @Test
    public void testSearchHotel2() {
        ArrayList<Hotel> foundHotels = mockDB.searchHotel("Hotel xx", "Hafnarfjordur");
        assertEquals(foundHotels.size(), 0);
    }

    @Test
    public void testAddUser() {
        User user = new User("John","johndoe@example.net", "johndoe123");
        userController.addUser(user);


    }

    @Test
    public void testAddBooking() {
        Booking booking = new Booking(mockDB.getAvailableRooms().get(4), "John", new Date(), new Date(), 100);
        bookingController.addBooking(booking);

    }
    @Test
    public void testCancelBooking() {

        Booking booking = new Booking(mockDB.getAvailableRooms().get(4), "John", new Date(), new Date(), 100);
        bookingController.addBooking(booking);
        bookingController.removeBooking(booking);
    }

    @Test
    public void testPayAndFinish() { //laga
        Booking booking = new Booking(mockDB.getAvailableRooms().get(4), "John", new Date(), new Date(), 100);
        bookingController.addBooking(booking);
        bookingController.payAndFinish(booking);
    }

    @Test
    public void testAddReview() {
        Review review = new Review(5, "Very good", "John", mockDB.searchHotel("Hotel HBV", "Hafnarfjordur").get(0));
        mockDB.addReview(review);

        assertEquals(mockDB.getReviews().size(), 5);
    }



}

// TODO: laga hvar hlutir eiga að vera, nota mock object í staðin fyrir mock database eða ehv þannig.
// TODO: setja aðferðir í réttan controller?



package verkefni.verkefnihbv30000;
import com.sun.source.tree.NewArrayTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import verkefni.verkefnihbvvol30000.*;

import java.util.ArrayList;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

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

    // HotelController test cases
    @Test
    public void testGetAvailableRooms1() {
        ArrayList<Room> rooms = mockDB.getAvailableRooms();
        assertEquals(rooms.size(), 6);

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
    public void testAddRoom() {
        Room room = new Room(mockDB.getHotels().get(0), 1, true, 100);
        mockDB.addRoom(room);
        assertEquals(mockDB.getAvailableRooms().size(), 7);
    }
    @Test
    public void testAddRoom2() {
        Room room = new Room(mockDB.getHotels().get(0), 1, true, 100);
        hotelController.addRoom(room);
        assertEquals(mockDB.getAvailableRooms().size(), 7);
    }

    @Test
    public void testAddReview() {
        Review review = new Review(5, "Very good", "John", mockDB.getHotels().get(0));
        mockDB.addReview(review);

        assertEquals(mockDB.getReviews().size(), 4);
    }

    // UserController test cases
    @Test
    public void testAddUser() {
        User user = new User("John","johndoe@example.net", "johndoe123");
        mockDB.addUser(user);
        assertEquals(mockDB.getUsers().size(), 4);
    }
    @Test
    public void testAddUser2() {
        User user = new User("jóntatan","joho@example.net", "hello123");
        userController.addUser(user);
        assertEquals(mockDB.getUsers().size(), 4);
    }

    @Test
    public void testFindUser1() {
        User user = new User("John","johndoe@example.net", "johndoe123");
        mockDB.addUser(user);
        assertEquals(mockDB.findUser(user), user);
        assertNotNull(mockDB.findUser(user));
    }
    @Test
    public void testFindUser2() {
        User user = new User("stina fina","stina@sjalli.is", "gktrjoia");

        assertEquals(mockDB.findUser(user), null);

    }

    // BookingController test cases
    @Test
    public void testAddBooking() {
        Booking booking = new Booking(mockDB.getAvailableRooms().get(4), "John", new Date(), new Date(), 100);
        bookingController.addBooking(booking);

        ArrayList<Booking> bookings = bookingController.searchBookings("John");

        assertEquals(2, bookings.size());
        assertEquals("John", bookings.get(0).getUserName());
        assertNotNull(bookings);

    }
    @Test
    public void testCancelBooking() {
        Booking booking = new Booking(mockDB.getAvailableRooms().get(4), "John", new Date(), new Date(), 100);

        bookingController.addBooking(booking);
        assertEquals(3, bookingController.searchBookings("John").size());

        bookingController.removeBooking(booking);
        assertEquals(2, bookingController.searchBookings("John").size());
    }

    @Test
    public void testSearchBookings1() {
        ArrayList<Booking> bookings = bookingController.searchBookings("John");
        assertEquals(2, bookings.size());
    }

    @Test
    public void testSearchBookings2() {
        ArrayList<Booking> bookings = bookingController.searchBookings("nomameguy");
        assertEquals(0, bookings.size());
    }

}




package verkefni.verkefnihbv30000;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import verkefni.verkefnihbvvol30000.*;

import java.util.ArrayList;

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
    public void testGetAvailableRooms() {
        ArrayList<Room> rooms = mockDB.getAvailableRooms();
        System.out.println(rooms.size());

        assertEquals(rooms.size(), 6);
    }



}





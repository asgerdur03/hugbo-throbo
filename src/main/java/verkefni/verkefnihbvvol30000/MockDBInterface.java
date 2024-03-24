package verkefni.verkefnihbvvol30000;

import java.util.ArrayList;

public interface MockDBInterface {

    public void addBooking(Booking booking);
    public void addReview(Review review);
    public void addHotel(Hotel hotel);
    public void addRoom(Room room);
    public void addUser(User user);

    public void removeBooking(Booking booking);



    public ArrayList<Hotel> searchHotel(String hotelName, String hotelAddress);






}

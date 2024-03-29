package verkefni.verkefnihbvvol30000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;




public class MockDB implements MockDBInterface {

    // Lists to store hotels, rooms, bookings, reviews, and users
    private ArrayList<Hotel> hotels;
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;
    private ArrayList<Review> reviews;
    private ArrayList<User> users;

    // Constructor to initialize mock data
    public MockDB() {
        hotels = new ArrayList<>();
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        reviews = new ArrayList<>();
        users = new ArrayList<>();

        // Initialize mock data for hotels, rooms, reviews, and users
        initializeMockData();
    }

    // Method to initialize mock data
    private void initializeMockData() {
        // Add mock hotels
        hotels.add(new Hotel("Hotel HBV", "Hafnarfjordur"));
        hotels.add(new Hotel("KEA", "Reykjavik"));
        hotels.add(new Hotel("Hilton", "Akureyri"));
        hotels.add(new Hotel("Bed & Breakfast", "Kopavogur"));
        hotels.add(new Hotel("Gardabaer EHF", "Gardabaer"));

        // Add mock rooms
        rooms.add(new Room(hotels.get(0), 2, true, 100));
        rooms.add(new Room(hotels.get(2), 3, true, 150));
        rooms.add(new Room(hotels.get(1), 4, true, 200));
        rooms.add(new Room(hotels.get(1), 5, true, 250));
        rooms.add(new Room(hotels.get(0), 6, false, 300));
        rooms.add(new Room(hotels.get(4), 6, true, 300));

        // Add mock reviews
        reviews.add(new Review(5, "Very good", "John", hotels.get(0)));
        reviews.add(new Review(4, "Good", "Jane", hotels.get(1)));
        reviews.add(new Review(3, "Bad", "Bob", hotels.get(2)));

        // Add mock users
        users.add(new User("John", "John@school.com", "zdgrjse"));
        users.add(new User("Jane", "Jane@slay.net", "janejane"));
        users.add(new User("Bob", "Bo53B@example.com", "bob1234"));

        // Add mock bookings
        bookings.add(new Booking(rooms.get(0), "John", new Date(2020, 1, 1), new Date(2020, 1, 2), 100));
        bookings.add(new Booking(rooms.get(1), "Jane", new Date(2020, 1, 1), new Date(2020, 1, 2), 150));
        bookings.add(new Booking(rooms.get(2), "Bob", new Date(2020, 1, 1), new Date(2020, 1, 2), 200));
        bookings.add(new Booking(rooms.get(3), "John", new Date(2020, 1, 1), new Date(2020, 1, 2), 250));
    }

    // Method to add a booking
    @Override
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    // Method to add a review
    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    // Method to add a hotel
    @Override
    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    // Method to add a room
    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Method to add a user
    @Override
    public void addUser(User user) {
        users.add(user);
    }

    // Method to remove a booking
    @Override
    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    // Method to get all bookings
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    // Method to get all reviews
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    // Method to get all hotels
    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    // Method to get all rooms
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    // Method to get all users
    public ArrayList<User> getUsers() {
        return users;
    }

    // Method to get available rooms
    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getAvailability()) {
                availableRooms.add(room);
            }
        }
        return rooms;
    }

    // Method to search for hotels by name and address
    @Override
    public ArrayList<Hotel> searchHotel(String hotelName, String hotelAddress) {
        ArrayList<Hotel> foundHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getHotelName().equals(hotelName) && hotel.getHotelAddress().equals(hotelAddress)) {
                foundHotels.add(hotel);
            }
        }
        return foundHotels;
    }

    // Method to find a user by name and password
    public User findUser(User u) {
        for (User user : users) {
            if (user.getName().equals(u.getName()) && user.getPassword().equals(u.getPassword())) {
                return user;
            }
        } return null;
    }

}
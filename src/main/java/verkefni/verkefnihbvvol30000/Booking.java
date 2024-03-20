package verkefni.verkefnihbvvol30000;

import verkefni.verkefnihbvvol30000.Room;

import java.util.Date;

public class Booking {

    Room hotelRoom;
    String userName;
    Date begin;
    Date end;
    float totalPrice;

    public Booking(Room hotelRoom, String userName, Date begin, Date end, float price) {
        this.hotelRoom = hotelRoom;
        this.userName = userName;
        this.begin = begin;
        this.end = end;
        this.totalPrice = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    public Room getRoom() {
        return hotelRoom;
    }

    public void setRoom(Room room) {
        this.hotelRoom = room;
    }

    public float getPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return hotelRoom.getHotel().toString() +
                "  " +  begin + '/' + end +
                "     " + totalPrice;
    }
}

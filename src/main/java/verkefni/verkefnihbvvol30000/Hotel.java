package verkefni.verkefnihbvvol30000;

public class Hotel {
    String hotelName;
    String hotelAddress;
    float ratings;

    public Hotel(String hotelName, String hotelAddress, float ratings){
        this.hotelAddress=hotelAddress;
        this.hotelName=hotelName;
        this.ratings=ratings;
    }
    public String getHotelName(){
        return hotelName;
    }
    public String getHotelAddress(){
        return hotelAddress;
    }
    public void setHotelName(String hotelName){
        this.hotelName=hotelName;
    }
    public void setHotelAddress(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }
    @Override
    public String toString() {
        return hotelName + " - " + hotelAddress;}
}

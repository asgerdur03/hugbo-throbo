package verkefni.verkefnihbvvol30000;

public class Hotel {
    String hotelName;
    String hotelAddress;
    Review review;

    public Hotel(String hotelName, String hotelAddress, Review review){
        this.hotelAddress=hotelAddress;
        this.hotelName=hotelName;
        this.review =review;
    }

    public Hotel(String hotelName, String hotelAddress) {
        this.hotelAddress=hotelAddress;
        this.hotelName=hotelName;
    }

    public Review getReview(){
        return review;
    }
    public void setReview(Review review){
        this.review=review;
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

    public Hotel getHotel() {
        return this;
    }
}

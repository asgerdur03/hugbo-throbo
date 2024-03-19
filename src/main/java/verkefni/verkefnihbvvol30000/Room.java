package verkefni.verkefnihbvvol30000;

public class Room {

    int beds;
    boolean availability;
    float prizePerNight;
    Hotel hotel;

    public Room(Hotel hotel, int beds, boolean availability, float prizePerNight){
        this.hotel = hotel;
        this.beds=beds;
        this.availability=availability;
        this.prizePerNight=prizePerNight;
    }
    public Hotel getHotel(){
        return hotel;
    }
    public void setHotel(Hotel hotel){
        this.hotel=hotel;
    }
    public int getBeds(){
        return beds;
    }
    public void setBeds(int beds){
        this.beds=beds;
    }
    public boolean getAvailability(){
        return availability;
    }
    public void setAvailability(boolean availability){
        this.availability=availability;
    }
    public float getPrizePerNight(){
        return prizePerNight;
    }
    public void setPrizePerNight(float prizePerNight){
        this.prizePerNight=prizePerNight;
    }
    @Override
    public String toString() {
        return String.format("%d beds, %1.0f kr/night",beds,prizePerNight);
    }
}


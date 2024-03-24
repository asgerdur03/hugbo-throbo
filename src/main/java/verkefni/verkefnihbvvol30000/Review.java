package verkefni.verkefnihbvvol30000;

public class Review {

    private int stars;
    private String comment;
    private String guest;
    Hotel hotel;

    public Review(int stars, String comment, String guest, Hotel hotel) {
        this.stars=stars;
        this.comment=comment;
        this.guest=guest;
    }

    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getGuest() {
        return guest;
    }
    public void setGuest(String guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Review [stars=" + stars + ", comment=" + comment + ", guest=" + guest + "]";
    }
}

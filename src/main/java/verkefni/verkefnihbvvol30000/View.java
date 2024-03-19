package verkefni.verkefnihbvvol30000;

/**
 * @author Almas Baimagambetov
 */

public enum View {
    BOOKING("booking-view.fxml"),
    HOTEL("hotel-view.fxml"),
    USER("user-view.fxml");


    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

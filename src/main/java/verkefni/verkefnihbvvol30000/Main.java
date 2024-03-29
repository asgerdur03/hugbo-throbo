package verkefni.verkefnihbvvol30000;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var scene = new Scene(new Pane());

        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.HOTEL);


        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
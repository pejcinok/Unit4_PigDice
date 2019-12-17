import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PigDieGUI extends Application {
    public void start(Stage stage) {
        Scene scene = new Scene(new PigDiePane(), 600, 300);

        stage.setTitle("Welcome to Pig Dice!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
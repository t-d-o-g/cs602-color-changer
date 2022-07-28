import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class ColorChanger extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
				Rectangle rect = new Rectangle(50, 50, 300, 100);

				Group root = new Group(rect);
        scene = new Scene(root, 640, 480, Color.WHITE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
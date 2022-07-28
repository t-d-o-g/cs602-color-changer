import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Slider;
import javafx.scene.transformk.Translate;
import javafx.stage.Stage;

import java.io.IOException;


public class ColorChanger extends Application {

	private static Scene scene;

	public void start(Stage stage) throws IOException {
		Slider slider = new Slider(0, 255, 0);
		Rectangle rect = new Rectangle(50, 50, 300, 100);

		slider.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue) {
				System.out.println("RGB Color Value: " + newValue.intValue());
				rect.setFill(Color.rgb(newValue.intValue(), newValue.intValue(), newValue.intValue()));
			}
		});
		
		Group root = new Group(rect);
		scene = new Scene(root, 400, 200, Color.WHITE);
		stage.setScene(scene);
		stage.setTitle("Color Changer");
		root.getChildren().add(slider);
		stage.show();
	}

	public static void main(String[] args) {
			launch();
	}
}
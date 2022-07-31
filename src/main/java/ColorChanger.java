import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Slider;
import javafx.scene.transformk.Translate;
import javafx.stage.Stage;

import java.io.IOException;


public class ColorChanger extends Application {
	private Text title = new Text("Color Changer");
	private int r = 0;
	private int g = 0;
	private int b = 0;

	private static Scene scene;

	public void start(Stage stage) throws IOException {
		Slider sliderR = new Slider(0, 255, 0);
		Slider sliderG = new Slider(0, 255, 0);
		Slider sliderB = new Slider(0, 255, 0);
		Rectangle rect = new Rectangle(50, 50, 300, 100);

		sliderR.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue) {
				r = newValue.intValue();
				System.out.println("R: " + r + ", G: " + g + ", B: " + b);
				rect.setFill(Color.rgb(r, g, b));
			}
		});
		
		sliderG.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue) {
				g = newValue.intValue();
				System.out.println("R: " + r + ", G: " + g + ", B: " + b);
				rect.setFill(Color.rgb(r, g, b));
			}
		});
		
		sliderB.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue) {
				b = newValue.intValue();
				System.out.println("R: " + r + ", G: " + g + ", B: " + b);
				rect.setFill(Color.rgb(r, g, b));
			}
		});
		
		GridPane.setHalignment(title, HPos.CENTER);
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		scene = new Scene(root, 400, 400, Color.WHITE);
		stage.setScene(scene);
		stage.setTitle("Color Changer");
		root.setVgap(20);
		root.add(title, 0, 0, 2, 1);
		root.add(sliderR, 0, 2);
		root.add(sliderG, 0, 3);
		root.add(sliderB, 0, 4);
		root.add(rect, 0, 5);
		stage.show();
	}

	public static void main(String[] args) {
			launch();
	}
}
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Try extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

//		// Create a handler for animation
//		EventHandler<ActionEvent> eventHandler = e -> {
//			 // Set a new clock time
//		};
		BorderPane first = new BorderPane();

		Level1 l1 = new Level1();
		Level2 l2 = new Level2();
		Level3 l3 = new Level3();
		Level4 l4 = new Level4();
		level5 l5 = new level5();

//		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
//		animation.setCycleCount(Timeline.INDEFINITE);
//		animation.play(); // Start animation

//		first.setCenter(l1);
//		first.setRight(l2);
//		first.setLeft(l3);

		Scene s = new Scene(l1);
		primaryStage.setScene(s);
		primaryStage.setWidth(800);
		primaryStage.setHeight(500);
		primaryStage.show();
	}

}

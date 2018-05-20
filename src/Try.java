import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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
Opening opening=new Opening();
        Level1 l1 = new Level1();
        Level2 l2 = new Level2();
        Level3 l3 = new Level3();
        Level4 l4 = new Level4();
        Level5 l5 = new Level5();
        Level5_1 l5_1 = new Level5_1();
        Anime anime = new Anime();
//		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
//		animation.setCycleCount(Timeline.INDEFINITE);
//		animation.play(); // Start animatio

//		first.setCenter(l1);
//		first.setRight(l2);
//		first.setLeft(l3);

        Scene s = new Scene(opening);

//        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(2000), event -> {
//            if (l1.isLevel1Finished) primaryStage.setScene(s1);
//        }));
//        timeline.setCycleCount(1);
//        timeline.setDelay(Duration.millis(2000));
//        timeline.play();


		/*Scene s1=new Scene(l2);
		Timeline level2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
			primaryStage.setScene(s1);
		}));
		level2.setCycleCount(1);
		level2.setDelay(Duration.millis(3500));
		Timeline level1=new Timeline(new KeyFrame(Duration.millis(10),event -> {
			primaryStage.setScene(s);
		}));
		level1.setDelay(Duration.millis(3500));
		level1.setCycleCount(1);
		SequentialTransition seq=new SequentialTransition();
		seq.getChildren().addAll(level1,level2);
		seq.setDelay(Duration.millis(4000));
		seq.play();
		*/
        primaryStage.setScene(s);
        primaryStage.setWidth(600);
        primaryStage.setHeight(500);
        primaryStage.show();
    }

}

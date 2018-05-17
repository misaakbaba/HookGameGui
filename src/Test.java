import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * This test class is required to show level classes.
 * select the level which you want to show,add it to scene
 * */
public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Level1 l1 = new Level1();
        Level2 l2 = new Level2();
        Level3 l3 = new Level3();
        Level4 l4 = new Level4();
        level5 l5 = new level5();
        Pane opening =new Pane();


        Scene s = new Scene(opening);//select the level which you want to show,add it to scene
        Scene sLevel1=new Scene(l1);
        primaryStage.setScene(s);
        primaryStage.setWidth(800);
        primaryStage.setHeight(500);
        primaryStage.show();
        Button lvl1=new Button("level1");
        lvl1.setLayoutX(400);
        opening.getChildren().add(lvl1);
        lvl1.setOnMouseClicked(e -> primaryStage.setScene(sLevel1));

    }

}

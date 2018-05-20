import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * This test class is required to show level classes.
 * select the level which you want to show,add it to scene
 * */
public class Test extends Application {
    boolean finished=false;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Level1 l1 = new Level1();
        Level2 l2 = new Level2();
        Level3 l3 = new Level3();
        Level4 l4 = new Level4();
        Level5 l5 = new Level5();
        Pane opening =new Pane();


        Scene s = new Scene(opening);//select the level which you want to show,add it to scene
        Scene sLevel1=new Scene(l1);
        Scene sLevel5=new Scene(l5);
        Scene sLevel4=new Scene(l4);
        primaryStage.setScene(s);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
        Button lvl1=new Button("level1");
        Button lvl5= new Button("Level5");
        Button pass=new Button("passed");
        pass.setLayoutX(100);
        pass.setLayoutY(100);
        opening.getChildren().addAll(pass);

        lvl1.setLayoutX(200);
        lvl5.setLayoutX(250);
        //opening.getChildren().addAll(lvl1,lvl5);
        // lvl1.setOnMouseClicked(e -> primaryStage.setScene(sLevel1));
        // lvl5.setOnMouseClicked(e -> primaryStage.setScene(sLevel5));
        Rectangle rectangle=new Rectangle(0,0,500,500);
        rectangle.setFill(Color.GREEN);

        Circle outerCircle=new Circle();
        outerCircle.setRadius(250);
        outerCircle.setCenterX(250);
        outerCircle.setCenterY(250);
        outerCircle.setFill(Color.RED);
        Circle innerCircle =new Circle();
        innerCircle.setRadius(200);
        innerCircle.setCenterX(250);
        innerCircle.setCenterY(250);
        innerCircle.setFill(Color.BLUEVIOLET);
        Text welcomeText=new Text(100,170,"Welcome To Hook Game");
        welcomeText.setFont(Font.font("Times New Roman",25));
        welcomeText.setFill(Color.BLACK);
        //
        pass.setOnMouseClicked(e -> primaryStage.setScene(sLevel4));

        if (finished) {
              primaryStage.setScene(sLevel1);
           // opening.getChildren().addAll(rectangle,outerCircle,innerCircle,welcomeText);
        }


    }

}

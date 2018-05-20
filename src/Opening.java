import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.util.Duration;

import javax.xml.soap.Text;
import java.sql.Time;

public class Opening extends Pane  {
    double startX=180,startY=200,endX=350,endY=200;
    Circle circle = new Circle(100, 200, 20);
    Line path1 = new Line(120, 200, 180, 200), gate=new Line(180,190,180,210);
    Arc arc;
    Line boldLine;

    javafx.scene.text.Text text=new javafx.scene.text.Text("Welcome to Hook Game!\n    (Best Game Ever :)");
    javafx.scene.text.Text text2=new javafx.scene.text.Text("Click on Circle to Start");
    public Opening() {
        paintOpening();

        circle.setOnMouseClicked(event -> {
            Timeline timeline=new Timeline(new KeyFrame(Duration.millis(10),event1 -> {
                startX-=1;
                endX-=1;
                paintOpening();
            }));
            timeline.setCycleCount(250);
            timeline.play();

            Timeline timeline2=new Timeline(new KeyFrame(Duration.millis(10),event2 -> {
                gate.setStartY(gate.getStartY()-1);
                gate.setEndY(gate.getEndY()+1);
                paintOpening();
            }));
            timeline2.setCycleCount(10);
            timeline2.play();
            FadeTransition fadeTransition=new FadeTransition(Duration.millis(2000),circle);
            fadeTransition.setFromValue(1);
            fadeTransition.setToValue(0);
            fadeTransition.setDelay(Duration.millis(1600));
            fadeTransition.play();

            FadeTransition fadeTransition2=new FadeTransition(Duration.millis(2000),path1);
            fadeTransition2.setFromValue(1);
            fadeTransition2.setToValue(0);
            fadeTransition2.setDelay(Duration.millis(1600));
            fadeTransition2.play();

            FadeTransition fadeTransition3=new FadeTransition(Duration.millis(2000),gate);
            fadeTransition3.setFromValue(1);
            fadeTransition3.setToValue(0);
            fadeTransition3.setDelay(Duration.millis(1600));
            fadeTransition3.play();

            FadeTransition fadeTransition6=new FadeTransition(Duration.millis(2000),text);
            fadeTransition6.setFromValue(1);
            fadeTransition6.setToValue(0);
            fadeTransition6.setDelay(Duration.millis(1600));
            fadeTransition6.play();

            FadeTransition fadeTransition5=new FadeTransition(Duration.millis(2000),text2);
            fadeTransition5.setFromValue(1);
            fadeTransition5.setToValue(0);
            fadeTransition5.setDelay(Duration.millis(1600));
            fadeTransition5.play();

            fadeTransition2.setOnFinished(event1 -> {
                Level1 l1=new Level1();
                getChildren().clear();
                l1.setOpacity(0);
                getChildren().add(l1);
                FadeTransition fadeTransition4=new FadeTransition(Duration.millis(2000),l1);
                fadeTransition4.setFromValue(0);
                fadeTransition4.setToValue(1);
                fadeTransition4.play();
            });
        });


    }

    void paintOpening() {
        getChildren().clear();
        Rectangle rectangle = new Rectangle(0, 140, 180, 100);
        rectangle.setFill(Color.WHITE);

        circle.setFill(Color.GRAY);
        Arc arc=new Arc(endX+20, endY, 20,20, 360, 180);


        gate.setStrokeWidth(3);
        gate.setStroke(Color.BLACK);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStrokeWidth(3);
        arc.setStroke(Color.BLACK);
        getChildren().add(arc);
boldLine=new Line(startX,startY,endX,endY);
        boldLine.setStrokeWidth(3);
        getChildren().add(boldLine);
        getChildren().add(rectangle);
        getChildren().add(path1);
        getChildren().add(circle);
        getChildren().add(gate);
        boldLine.setStroke(Color.BLACK);

        text.setFont(Font.font(30));
        text.setX(100);
        text.setY(80);
        getChildren().add(text);
        text2.setFont(Font.font(30));
        text2.setX(90);
        text2.setY(350);
        getChildren().add(text2);


    }
}

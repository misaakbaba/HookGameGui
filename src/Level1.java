import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Level1 extends Drawings {
    public boolean isPushedBoldline2 = false;

    Circle circle1 = new Circle(400, 220, 20);
    Circle circle2 = new Circle(320, 270, 20);
    Line gate1 = new Line(100, 93, 100, 107);
    Line gate2 = new Line(313, 200, 327, 200);// this is the vertical line
    private double startX = 100, startY = 100, endX = 300, endY = 100;
    private double startX2 = 320, startY2 = 97, endX2 = 320, endY2 = 200;

    public Level1() {




        paintLevel1();




        Text text = new Text(180, 50, "Level 1");
        text.setFont(Font.font("Times New Roman", 25));
        getChildren().add(text);
        text.setOpacity(0);

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            if (text.getOpacity() < 0.8)
                text.setOpacity(text.getOpacity() + 0.15);
        }));
        animation.setCycleCount(20);
        animation.play(); // Start animation

        Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            text.setOpacity(text.getOpacity() - 0.05);
        }));
        animation2.setCycleCount(50);
        animation2.play(); // Start animation


        Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            startX += -1;
            endX += -1;
            paintLevel1();

        }));
        animation3.setCycleCount(300);


        Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate1.setStartY(gate1.getStartY() - 1);
            gate1.setEndY(gate1.getEndY() + 1);
            paintLevel1();

        }));
        animation4.setCycleCount(15);

        circle1.setOnMouseClicked(e -> {
            if (isPushedBoldline2) {
                animation3.play(); // Start animation
                animation4.play();
                FadeTransition fade = new FadeTransition(Duration.millis(6000), gate1);
                fade.setFromValue(2);
                fade.setToValue(0);
                fade.play();
            } else {
                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate1.setStartY(gate1.getStartY() - 1);
                    gate1.setEndY(gate1.getEndY() + 1);
                    startX += -1;
                    endX += -1;
                    paintLevel1();
                }));
                broke.setCycleCount(17);
                System.out.println("s");
//				broke.play(); // Start animation
                System.out.println("s");
                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startX += 1;
                    endX += 1;
                    paintLevel1();
                }));
                broke2.setCycleCount(10);
//				broke2.playFrom(new Duration(10000)); // Start animation

                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke, broke2);
                seq.play();

            }

        });

        Timeline animation5 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            startY2 += 1;
            endY2 += 1;
            paintLevel1();

        }));
        animation5.setCycleCount(110);

        Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate2.setStartX(gate2.getStartX() - 1);
            gate2.setEndX(gate2.getEndX() + 1);
            paintLevel1();

        }));
        animation6.setCycleCount(15);

        circle2.setOnMouseClicked(e -> {
            isPushedBoldline2 = true;
            animation5.play(); // Start animation
            animation6.play();
            FadeTransition fade = new FadeTransition(Duration.millis(2000), gate2);
            fade.setFromValue(5);
            fade.setToValue(0);
            fade.play();
        });


    }

    public void paintLevel1() {
        Rectangle rectangle3 = new Rectangle(0, 0, 800, 500);
        rectangle3.setFill(Color.WHITE);
        getChildren().add(rectangle3);



        Rectangle rectangle = new Rectangle(0, 0, 100, 150);
        rectangle.setFill(Color.WHITE);

        Rectangle rectangle2 = new Rectangle(270, 200, 100, 150);
        rectangle2.setFill(Color.WHITE);


        getChildren().clear();
        paintBoldLine();
        paintBoldLine2();
        getChildren().add(rectangle);
        getChildren().add(rectangle2);
        paintPath();
        paintCircle1();
        paintPath2();
        paintCircle2();
        paintGate();
        paintGate2();


    }

    private void paintBoldLine() {
        Line hLine = new Line(startX, startY, endX, endY);
        hLine.setStrokeWidth(3);
        hLine.setStroke(Color.BLACK);

        Arc semiCircle = new Arc(startX + 220, startY, 20, 20, 360, 180);
        semiCircle.setType(ArcType.OPEN);
        semiCircle.setFill(Color.WHITE);
        semiCircle.setStrokeWidth(3);
        semiCircle.setStroke(Color.BLACK);

        Line hLineC = new Line(startX + 240, startY, endX + 80, endY);
        hLineC.setStrokeWidth(3);
        hLineC.setStroke(Color.BLACK);

        getChildren().add(hLine);
        getChildren().add(semiCircle);
        getChildren().add(hLineC);
    }

    private void paintBoldLine2() {
        Line line = new Line(startX2, startY2, endX2, endY2);
        line.setStrokeWidth(3);
        line.setStroke(Color.BLACK);

        getChildren().add(line);
    }

    private void paintPath() {
        Line path1 = new Line(90, 100, 100, 100);
        path1.setStrokeWidth(2);
        path1.setStroke(Color.GRAY);
        Line path2 = new Line(90, 100, 90, 220);
        path2.setStrokeWidth(2);
        path2.setStroke(Color.GRAY);
        Line path3 = new Line(90, 220, 400, 220);
        path3.setStrokeWidth(2);
        path3.setStroke(Color.GRAY);

        getChildren().add(path1);
        getChildren().add(path2);
        getChildren().add(path3);

    }

    private void paintPath2() {
        Line path1 = new Line(320, 200, 320, 250);
        path1.setStrokeWidth(2);
        path1.setStroke(Color.GRAY);

        getChildren().add(path1);

    }

    private void paintCircle1() {

        circle1.setFill(Color.GRAY);

        getChildren().add(circle1);

    }

    private void paintCircle2() {

        circle2.setFill(Color.GRAY);

        getChildren().add(circle2);

    }

    private void paintGate() {


        gate1.setStrokeWidth(3);
        gate1.setStroke(Color.BLACK);
        getChildren().add(gate1);
    }

    private void paintGate2() {

        // that is between
        gate2.setStrokeWidth(3); // the horizontal line and the path
        gate2.setStroke(Color.BLACK);
        getChildren().add(gate2);

    }

    private void restartLevel() {

        startX = 100;
        startY = 100;
        endX = 300;
        endY = 100;
        paintLevel1();
    }

}	
	

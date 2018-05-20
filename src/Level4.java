import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;


public class Level4 extends Drawings {
    Timeline animation;
    Circle rotatingCircle = new Circle(190, 260, 20);
    Line hLine1, line2, hLine3;
    Line path1 = new Line(190, 100, 200, 100), path2 = new Line(190, 100, 190, 240),
            path3 = new Line(190, 280, 190, 320), path4 = new Line(210, 260, 420, 260),
            path5 = new Line(420, 250, 420, 260), path6 = new Line(120, 260, 170, 260);
    Circle circle1 = new Circle(190, 340, 20), circle2 = new Circle(100, 260, 20);
    Line gate1 = new Line(200, 93, 200, 107);
    Line gate2 = new Line(413, 250, 427, 250);
    boolean isVertical = true, isPushedBoldLine = false;
    private double startX = 440, startY = 100, endX = 460, endY = 100;
    Arc semiCircle = new Arc(startX - 20, startY, 20, 20, 360, 180);
    private double startX2 = 420, startY2 = 100, endX2 = 420, endY2 = 250;
    private Line rotatingLine = new Line(190, 240, 190, 280);

    public Level4() {
        paintLevel4();

        rotatingCircle.setOnMouseClicked(e -> {
            rotateAction();
            if (isVertical) isVertical = false;
            else isVertical = true;
        });
        Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(10), e -> {//line1 moving
            startY2 += 1;
            endY2 += 1;
            paintLevel4();
        }));
        animation1.setCycleCount(200);
        Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), e -> {//gate1 moving
            gate2.setStartX(gate2.getStartX() - 1);
            gate2.setEndX(gate2.getEndX() + 1);
            paintLevel4();
        }));
        animation2.setCycleCount(20);
        animation1.setCycleCount(200);
        Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(10), e -> {//gate1 moving
            gate2.setStartX(gate2.getStartX() + 1);
            gate2.setEndX(gate2.getEndX() - 1);
            paintLevel4();
        }));
        animation3.setDelay(Duration.millis(1500));
        animation3.setCycleCount(15);
        FadeTransition fade = new FadeTransition(Duration.millis(2000), gate2);
        fade.setDelay(Duration.millis(1500));
        fade.setFromValue(1);
        fade.setToValue(0);

        FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path4);
        fade2.setDelay(Duration.millis(1500));
        fade2.setFromValue(1);
        fade2.setToValue(0);

        FadeTransition fade3 = new FadeTransition(Duration.millis(2000), path5);
        fade3.setDelay(Duration.millis(1500));
        fade3.setFromValue(1);
        fade3.setToValue(0);

        FadeTransition fade4 = new FadeTransition(Duration.millis(2000), path6);
        fade4.setDelay(Duration.millis(1500));
        fade4.setFromValue(1);
        fade4.setToValue(0);

        FadeTransition fade5 = new FadeTransition(Duration.millis(2000), circle2);
        fade5.setDelay(Duration.millis(1500));
        fade5.setFromValue(1);
        fade5.setToValue(0);
        circle2.setOnMouseClicked(event -> {
            if (!isVertical) {
                animation2.play();
                animation1.play();
                animation3.play();
                fade.play();
                fade2.play();
                fade3.play();
                fade4.play();
                fade5.play();
                isPushedBoldLine = true;
            }
        });
        Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(10), e -> {//line2 moving
            startX -= 1;
            endX -= 1;
            paintLevel4();
        }));
        animation4.setCycleCount(290);
        Timeline animation5 = new Timeline(new KeyFrame(Duration.millis(10), e -> {//gate1 moving
            gate1.setStartY(gate1.getStartY() - 1);
            gate1.setEndY(gate1.getEndY() + 1);
            paintLevel4();
        }));
        animation5.setCycleCount(15);
        Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(10), e -> {//gate1 moving
            gate1.setStartY(gate1.getStartY() + 1);
            gate1.setEndY(gate1.getEndY() - 1);
            paintLevel4();
        }));
        animation6.setCycleCount(15);
        animation6.setDelay(Duration.millis(2600));

        FadeTransition fade6 = new FadeTransition(Duration.millis(2000), circle1);
        fade6.setDelay(Duration.millis(2600));
        fade6.setFromValue(1);
        fade6.setToValue(0);


        FadeTransition fade7 = new FadeTransition(Duration.millis(2000), gate1);
        fade7.setDelay(Duration.millis(2600));
        fade7.setFromValue(1);
        fade7.setToValue(0);


        FadeTransition fade8 = new FadeTransition(Duration.millis(2000), path1);
        fade8.setDelay(Duration.millis(2600));
        fade8.setFromValue(1);
        fade8.setToValue(0);


        FadeTransition fade9 = new FadeTransition(Duration.millis(2000), path2);
        fade9.setDelay(Duration.millis(2600));
        fade9.setFromValue(1);
        fade9.setToValue(0);


        FadeTransition fade10 = new FadeTransition(Duration.millis(2000), path3);
        fade10.setDelay(Duration.millis(2600));
        fade10.setFromValue(1);
        fade10.setToValue(0);

        FadeTransition fade11 = new FadeTransition(Duration.millis(2000), rotatingCircle);
        fade11.setDelay(Duration.millis(2600));
        fade11.setFromValue(1);
        fade11.setToValue(0);

        FadeTransition fade12 = new FadeTransition(Duration.millis(2000), rotatingLine);
        fade12.setDelay(Duration.millis(2600));
        fade12.setFromValue(1);
        fade12.setToValue(0);

        Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
            gate1.setStartY(93);
            gate1.setEndY(107);
            restartLevel();
            paintLevel4();
        }));
        restart.setCycleCount(1);
        restart.setDelay(Duration.millis(1700));

        Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
            gate1.setStartY(gate1.getStartY() - 1);
            gate1.setEndY(gate1.getEndY() + 1);
            startX -= 1;
            endX -= 1;
            paintLevel4();
        }));
        broke.setCycleCount(17);

        Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
            startX += 1;
            endX += 1;
            paintLevel4();
        }));
        broke2.setCycleCount(10);

        circle1.setOnMouseClicked(event -> {
            if(isVertical && isPushedBoldLine){
           animation4.play();
            animation5.play();
            animation6.play();
            fade6.play();
            fade7.play();
            fade8.play();
            fade9.play();
            fade10.play();
            fade11.play();
            fade12.play();
            fade12.setOnFinished(event1 -> {
                getChildren().clear();
                Level5 l5=new Level5();
                l5.setOpacity(0);
                getChildren().add(l5);
                FadeTransition fadeTransition=new FadeTransition(Duration.millis(2000),l5);
                fadeTransition.setFromValue(0);
                fadeTransition.setToValue(1);
                fadeTransition.play();
            });
            	}
            	if(isVertical && !isPushedBoldLine){
                FadeTransition fade13 = new FadeTransition(Duration.millis(2000), this);
                fade13.setFromValue(1);
                fade13.setToValue(0);
                fade13.setDelay(Duration.millis(200));
                // this animation brighten the pane
                FadeTransition fade14 = new FadeTransition(Duration.millis(2000), this);
                fade14.setFromValue(0);
                fade14.setToValue(1);
                fade14.setDelay(Duration.millis(2250));

                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke,broke2,restart);
               seq.play();
                fade13.play();
                fade14.play();
                gate1.setStartY(93);
                gate1.setEndY(107);
            }
        });


    }


    public void paintLevel4() {


        getChildren().clear();
        Rectangle rectangle2 = new Rectangle(325, 250, 200, 800);
        rectangle2.setFill(Color.WHITE);
        Rectangle rectangle = new Rectangle(0, 0, 200, 200);
        rectangle.setFill(Color.WHITE);
        linePainter(hLine1, startX, startY, endX, endY, 3, "black");
        arcDrawer(semiCircle, startX - 20, startY, 20, 360, 180);
        linePainter(line2, startX - 240, startY, endX - 60, endY, 3, "black");
        getChildren().add(rectangle);
        getChildren().add(path1);
        getChildren().add(path2);
        getChildren().add(path3);;
        circle1Paint();
        linePainter(hLine3, startX2, startY2, endX2, endY2, 3, "black");
        getChildren().add(rectangle2);
        getChildren().add(path4);
        getChildren().add(path5);
        getChildren().add(path6);
        circle2Paint();
        paintRotatingCircle();
        paintRotatingLine();
        paintGate1();
        paintGate2();

    }
    private void paintGate1() {

        gate1.setStrokeWidth(3);
        gate1.setStroke(Color.BLACK);

        getChildren().add(gate1);

    }

    private void paintGate2() {

        gate2.setStrokeWidth(3);
        gate2.setStroke(Color.BLACK);

        getChildren().add(gate2);

    }

    private void paintRotatingCircle() {

        rotatingCircle.setFill(Color.WHITE);
        rotatingCircle.setStroke(Color.gray(0.4));
        rotatingCircle.setStrokeWidth(3);

        getChildren().add(rotatingCircle);
    }

    private void paintRotatingLine() {
        rotatingLine.setStrokeWidth(2);
        rotatingLine.setStroke(Color.gray(0.4));


        getChildren().add(rotatingLine);


    }

    private void rotateRotatingLine() {
        if (rotatingLine.getStartX() == 190) {
            rotatingLine.setStartX(170);
            rotatingLine.setEndX(210);
            rotatingLine.setStartY(260);
            rotatingLine.setEndY(260);

        } else {
            rotatingLine.setStartX(190);
            rotatingLine.setEndX(190);
            rotatingLine.setStartY(240);
            rotatingLine.setEndY(280);

        }
    }

    public void rotateAction() {
        animation = new Timeline(
                new KeyFrame(Duration.millis(1), e -> {
                    rotateRotatingLine();
                }));
        animation.setCycleCount(1);
        animation.play(); // Start animation


    }

    void shorteningPairt2() {

    }

    void circle1Paint() {
        circle1.setFill(Color.GRAY);
        getChildren().add(circle1);
    }

    void circle2Paint() {
        circle2.setFill(Color.GRAY);
        getChildren().add(circle2);
    }
void restartLevel(){
    startX2 = 420;
    startY2 = 100;
    endX2 = 420;
    endY2 = 250;
    startX = 440;
    startY = 100;
    endX = 460;
    endY = 100;
    paintLevel4();
}

}
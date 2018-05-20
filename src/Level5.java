import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Level5 extends Drawings {
    boolean isPushedBoldLine1 = false, isPushedBoldLine2 = false, isPushedBoldLine3 = false, isPushedBoldLine4 = false;
    Timeline rotateAnimation;
    Timeline rotateAnimation2;
    Circle circle3 = new Circle(130, 400, 20), circle1 = new Circle(50, 260, 20),
            circle4 = new Circle(260, 400, 20), circle2 = new Circle(50, 340, 20);


    double startX1 = 140, startY1 = 100, endX1 = 170, endY1 = 100;
    double startX2 = 190, startY2 = 250, endX2 = 190, endY2 = 170;
    double startX3 = 250, startY3 = 150, endX3 = 190, endY3 = 150;
    double startX4 = 300, startY4 = 330, endX4 = 300, endY4 = 120;
    Arc arc1 = new Arc(endX1 + 20, endY1, 20, 20, 360, 180),
            arc2 = new Arc(endX2, endY2 - 20, 20, 20, 270, -180),
            arc3 = new Arc(endX4, endY4 - 20, 20, 20, 270, 180);
    boolean isPushedFigure4 = false, isPushedFigure3 = false, isPushedFigure1 = false;
    boolean isVertical1 = false, isVertical2 = true;
    private Line path1 = new Line(130, 380, 130, 100), path2 = new Line(50, 340, 130, 340),
            path3 = new Line(50, 260, 130, 260),
            path4 = new Line(130, 260, 190, 260), path6 = new Line(260, 380, 260, 150),
            path7 = new Line(260, 150, 250, 150), path8 = new Line(150, 340, 300, 340),
            path9 = new Line(300, 340, 300, 330), disLine = new Line(110, 340, 150, 340), disLine2 = new Line(130, 240, 130, 280),
            shortPath1 = new Line(130, 100, 140, 100), shortPath2 = new Line(190, 260, 190, 250);
    private Circle disCircle = new Circle(130, 340, 20), disCircle2 = new Circle(130, 260, 20);
    private Line boldLine1 = new Line(startX1, startY1, endX1, endY1), boldLine2 = new Line(startX1 + 70, startY1, endX1 + 135, endY1),
            boldLine3, boldLine4, boldLine5, boldLine6, boldLine7;
    private Line gate3 = new Line(140, 90, 140, 110), gate1 = new Line(180, 250, 200, 250),
            gate2 = new Line(290, 330, 310, 330), gate4 = new Line(250, 140, 250, 160);


    public Level5() {
        paintLevel5();

        disCircle.setOnMouseClicked(e -> {
            rotateAction();
        });

        disCircle2.setOnMouseClicked(e -> { //yukardaki
            rotateAction2();
        });
        circle3.setOnMouseClicked(event -> {
            if (isVertical2 && isVertical1 && isPushedFigure1) {
                isPushedFigure3=true;
                Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                    startX1 -= 1;
                    endX1 -= 1;
                    paintLevel5();
                }));
                animation.setCycleCount(200);
                animation.play();

                Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                    gate3.setStartY(gate3.getStartY() - 1);
                    gate3.setEndY(gate3.getEndY() + 1);
                    paintLevel5();
                }));
                animation2.setCycleCount(15);
                animation2.play();

                FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), shortPath1);
                fadeanimation.setDelay(Duration.millis(1500));
                fadeanimation.setFromValue(1);
                fadeanimation.setToValue(0);
                fadeanimation.play();

                FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), gate3);
                fadeanimation2.setDelay(Duration.millis(1500));
                fadeanimation2.setFromValue(1);
                fadeanimation2.setToValue(0);
                fadeanimation2.play();

                FadeTransition fadeanimation3 = new FadeTransition(Duration.millis(2000), path1);
                fadeanimation3.setDelay(Duration.millis(1500));
                fadeanimation3.setFromValue(1);
                fadeanimation3.setToValue(0);
                fadeanimation3.play();

                FadeTransition fadeanimation4 = new FadeTransition(Duration.millis(2000), circle3);
                fadeanimation4.setDelay(Duration.millis(1500));
                fadeanimation4.setFromValue(1);
                fadeanimation4.setToValue(0);
                fadeanimation4.play();

                FadeTransition fadeanimation5 = new FadeTransition(Duration.millis(2000), disCircle2);
                fadeanimation5.setDelay(Duration.millis(1500));
                fadeanimation5.setFromValue(1);
                fadeanimation5.setToValue(0);
                fadeanimation5.play();

                FadeTransition fadeanimation6 = new FadeTransition(Duration.millis(2000), disLine2);
                fadeanimation6.setDelay(Duration.millis(1500));
                fadeanimation6.setFromValue(1);
                fadeanimation6.setToValue(0);
                fadeanimation6.play();

            }
            else if(isVertical2 && isVertical1 && !isPushedFigure1){
                FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), this);
                fadeanimation.setFromValue(1);
                fadeanimation.setToValue(0);
                fadeanimation.setDelay(Duration.millis(200));
                // this animation brighten the pane
                FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), this);
                fadeanimation2.setFromValue(0);
                fadeanimation2.setToValue(1);
                fadeanimation2.setDelay(Duration.millis(2250));

                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate3.setStartY(gate3.getStartY() - 1);
                    gate3.setEndY(gate3.getEndY() + 1);
                    startX1 -= 1;
                    endX1 -= 1;
                    paintLevel5();
                }));
                broke.setCycleCount(17);

                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startX1 += 1;
                    endX1 += 1;
                    paintLevel5();
                }));
                broke2.setCycleCount(10);

                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate3.setStartY(90);
                    gate3.setEndY(110);
                    disLine2.setStartX(130);
                    disLine2.setEndX(130);
                    disLine2.setStartY(240);
                    disLine2.setEndY(280);
                    isVertical2=true;

                    disLine.setStartX(110);
                    disLine.setEndX(150);
                    disLine.setStartY(340);
                    disLine.setEndY(340);
                    isVertical1 = false;
                    restartLevel();
                    paintLevel5();
                }));
                restart.setCycleCount(1);
                restart.setDelay(Duration.millis(1700));


                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke,broke2,restart);
                seq.play();
                fadeanimation.play();
                fadeanimation2.play();
                gate3.setStartY(90);
                gate3.setEndY(110);
                disLine2.setStartX(130);
                disLine2.setEndX(130);
                disLine2.setStartY(240);
                disLine2.setEndY(280);
                isVertical2 = true;
                disLine.setStartX(110);
                disLine.setEndX(150);
                disLine.setStartY(340);
                disLine.setEndY(340);
                isVertical1 = false;

            }
        });
        circle4.setOnMouseClicked(event -> {
            isPushedFigure4 = true;
            Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                startX3 += 1;
                endX3 += 1;
                paintLevel5();
            }));
            animation.setCycleCount(200);
            animation.play();

            Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                gate4.setStartY(gate4.getStartY() - 1);
                gate4.setEndY(gate4.getEndY() + 1);
                paintLevel5();
            }));
            animation2.setCycleCount(15);
            animation2.play();

            FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), gate4);
            fadeanimation.setDelay(Duration.millis(500));
            fadeanimation.setFromValue(1);
            fadeanimation.setToValue(0);
            fadeanimation.play();

            FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), path6);
            fadeanimation2.setDelay(Duration.millis(500));
            fadeanimation2.setFromValue(1);
            fadeanimation2.setToValue(0);
            fadeanimation2.play();

            FadeTransition fadeanimation3 = new FadeTransition(Duration.millis(2000), path7);
            fadeanimation3.setDelay(Duration.millis(500));
            fadeanimation3.setFromValue(1);
            fadeanimation3.setToValue(0);
            fadeanimation3.play();

            FadeTransition fadeanimation4 = new FadeTransition(Duration.millis(2000), circle4);
            fadeanimation4.setDelay(Duration.millis(500));
            fadeanimation4.setFromValue(1);
            fadeanimation4.setToValue(0);
            fadeanimation4.play();
        });
        circle1.setOnMouseClicked(event -> {
            if (!isVertical2 && isPushedFigure4) {
                isPushedFigure1=true;
                Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                    startY2 += 1;
                    endY2 += 1;
                    paintLevel5();
                }));
                animation.setCycleCount(200);
                animation.play();

                Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                    gate1.setStartX(gate1.getStartX() - 1);
                    gate1.setEndX(gate1.getEndX() + 1);
                    paintLevel5();
                }));
                animation2.setCycleCount(15);
                animation2.play();

                FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), gate1);
                fadeanimation.setDelay(Duration.millis(1200));
                fadeanimation.setFromValue(1);
                fadeanimation.setToValue(0);
                fadeanimation.play();

                FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), circle1);
                fadeanimation2.setDelay(Duration.millis(1200));
                fadeanimation2.setFromValue(1);
                fadeanimation2.setToValue(0);
                fadeanimation2.play();

                FadeTransition fadeanimation3 = new FadeTransition(Duration.millis(2000), path3);
                fadeanimation3.setDelay(Duration.millis(1200));
                fadeanimation3.setFromValue(1);
                fadeanimation3.setToValue(0);
                fadeanimation3.play();

                FadeTransition fadeanimation4 = new FadeTransition(Duration.millis(2000), path4);
                fadeanimation4.setDelay(Duration.millis(1200));
                fadeanimation4.setFromValue(1);
                fadeanimation4.setToValue(0);
                fadeanimation4.play();

                FadeTransition fadeanimation5 = new FadeTransition(Duration.millis(2000), shortPath2);
                fadeanimation5.setDelay(Duration.millis(1200));
                fadeanimation5.setFromValue(1);
                fadeanimation5.setToValue(0);
                fadeanimation5.play();
            }
            else if(!isVertical2 &&!isPushedFigure4) {

                FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), this);
                fadeanimation.setFromValue(1);
                fadeanimation.setToValue(0);
                fadeanimation.setDelay(Duration.millis(200));
                // this animation brighten the pane
                FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), this);
                fadeanimation2.setFromValue(0);
                fadeanimation2.setToValue(1);
                fadeanimation2.setDelay(Duration.millis(2250));

                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate1.setStartX(gate1.getStartX() - 1);
                    gate1.setEndX(gate1.getEndX() + 1);
                    startY2 += 1;
                    endY2 += 1;
                    paintLevel5();
                }));
                broke.setCycleCount(17);

                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startY2 -= 1;
                    endY2 -= 1;
                    paintLevel5();
                }));
                broke2.setCycleCount(10);

                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate1.setStartX(180);
                    gate1.setEndX(200);
//                    disLine2.setStartX(130);
//                    disLine2.setEndX(130);
//                    disLine2.setStartY(240);
//                    disLine2.setEndY(280);
//                    isVertical2=true;
//
//                    disLine.setStartX(110);
//                    disLine.setEndX(150);
//                    disLine.setStartY(340);
//                    disLine.setEndY(340);
//                    isVertical1 = false;
                    restartLevel();
                    paintLevel5();
                }));
                restart.setCycleCount(1);
                restart.setDelay(Duration.millis(1700));


                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke,broke2,restart);
                seq.play();
               fadeanimation.play();
               fadeanimation2.play();
                gate1.setStartX(180);
                gate1.setEndX(200);
                // dissline hemen geri geliyor

            }


        });
        circle2.setOnMouseClicked(event -> {
            if (!isVertical1 && isPushedFigure3) {
                Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                    startY4 += 1;
                    endY4 += 1;
                    paintLevel5();
                }));
                animation.setCycleCount(300);
                animation.play();

                Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), event1 -> {
                    gate2.setStartX(gate2.getStartX() - 1);
                    gate2.setEndX(gate2.getEndX() + 1);
                    paintLevel5();
                }));
                animation2.setCycleCount(15);
                animation2.play();

                FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), gate2);
                fadeanimation.setDelay(Duration.millis(2500));
                fadeanimation.setFromValue(1);
                fadeanimation.setToValue(0);
                fadeanimation.play();

                FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), path8);
                fadeanimation2.setDelay(Duration.millis(2500));
                fadeanimation2.setFromValue(1);
                fadeanimation2.setToValue(0);
                fadeanimation2.play();

                FadeTransition fadeanimation3 = new FadeTransition(Duration.millis(2000), path9);
                fadeanimation3.setDelay(Duration.millis(2500));
                fadeanimation3.setFromValue(1);
                fadeanimation3.setToValue(0);
                fadeanimation3.play();

                FadeTransition fadeanimation4 = new FadeTransition(Duration.millis(2000), path2);
                fadeanimation4.setDelay(Duration.millis(2500));
                fadeanimation4.setFromValue(1);
                fadeanimation4.setToValue(0);
                fadeanimation4.play();

                FadeTransition fadeanimation5 = new FadeTransition(Duration.millis(2000), circle2);
                fadeanimation5.setDelay(Duration.millis(2500));
                fadeanimation5.setFromValue(1);
                fadeanimation5.setToValue(0);
                fadeanimation5.play();

                FadeTransition fadeanimation6 = new FadeTransition(Duration.millis(2000), disCircle);
                fadeanimation6.setDelay(Duration.millis(2500));
                fadeanimation6.setFromValue(1);
                fadeanimation6.setToValue(0);
                fadeanimation6.play();

                FadeTransition fadeanimation7 = new FadeTransition(Duration.millis(2000), disLine);
                fadeanimation7.setDelay(Duration.millis(2500));
                fadeanimation7.setFromValue(1);
                fadeanimation7.setToValue(0);
                fadeanimation7.play();
            }
            else if(!isVertical1 && !isPushedFigure3){
                FadeTransition fadeanimation = new FadeTransition(Duration.millis(2000), this);
                fadeanimation.setFromValue(1);
                fadeanimation.setToValue(0);
                fadeanimation.setDelay(Duration.millis(200));
                // this animation brighten the pane
                FadeTransition fadeanimation2 = new FadeTransition(Duration.millis(2000), this);
                fadeanimation2.setFromValue(0);
                fadeanimation2.setToValue(1);
                fadeanimation2.setDelay(Duration.millis(2250));

                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate2.setStartX(gate2.getStartX() - 1);
                    gate2.setEndX(gate2.getEndX() + 1);
                    startY4 += 1;
                    endY4 += 1;
                    paintLevel5();
                }));
                broke.setCycleCount(17);

                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startY4 -= 1;
                    endY4 -= 1;
                    paintLevel5();
                }));
                broke2.setCycleCount(10);

                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate2.setStartX(290);
                    gate2.setEndX(310);
//                    disLine2.setStartX(130);
//                    disLine2.setEndX(130);
//                    disLine2.setStartY(240);
//                    disLine2.setEndY(280);
//                    isVertical2=true;
//
//                    disLine.setStartX(110);
//                    disLine.setEndX(150);
//                    disLine.setStartY(340);
//                    disLine.setEndY(340);
//                    isVertical1 = false;
                    restartLevel();
                    paintLevel5();
                }));
                restart.setCycleCount(1);
                restart.setDelay(Duration.millis(1700));


                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke,broke2,restart);
                seq.play();
                fadeanimation.play();
                fadeanimation2.play();
                gate2.setStartX(290);
                gate2.setEndX(310);
                disLine.setStartX(110);
                disLine.setEndX(150);
                disLine.setStartY(340);
                disLine.setEndY(340);
                isVertical1 = false;
            }
        });


    }

    void paintLevel5() {
        getChildren().clear();
        figure3();
        figure1();
        figure4();
        figure2();
    }

    void figure3() {
        Rectangle rectangle = new Rectangle(0, 50, 140, 100);
        rectangle.setFill(Color.WHITE);
        circle3Paint();
        gate3.setStrokeWidth(3);
        linePainter(boldLine1, startX1, startY1, endX1, endY1, 3, "black");
//        Line boldLine1=new Line(startX1,startY1,endX1,endY1);
//        boldLine1.setStrokeWidth(3);
//        boldLine1.setStroke(Color.BLACK);
//        getChildren().add(boldLine1);
        linePainter(boldLine2, startX1 + 70, startY1, endX1 + 135, endY1, 3, "black");
//        Line boldLine2=new Line(startX1+70,startY1,endX1+135,endY1);
//        boldLine2.setStrokeWidth(3);
//        boldLine2.setStroke(Color.BLACK);
//        getChildren().add(boldLine2);
        arcDrawer(arc1, endX1 + 20, endY1, 20, 360, 180);
        getChildren().add(rectangle);
        getChildren().add(path1);
        getChildren().add(shortPath1);
        getChildren().add(gate3);
    }


    void figure1() {
        Rectangle rectangle = new Rectangle(152, 250, 100, 1000);
        rectangle.setFill(Color.WHITE);
        linePainter(boldLine3, startX2, startY2, endX2, endY2, 3, "black");
        arcDrawer(arc2, endX2, endY2 - 20, 20, 270, -180);
        linePainter(boldLine7, endX2, endY2 - 40, endX2, endY2 - 70, 3, "black");
        getChildren().add(rectangle);
//        linePainter(path4, 130, 260, 190, 260, 2, "gray");
//        linePainter(path3, 50, 260, 130, 260, 2, "gray");
//        linePainter(shortPath2, 190, 260, 190, 250, 2, "gray");
        getChildren().add(path4);
        getChildren().add(path3);
        getChildren().add(shortPath2);
        getChildren().add(gate1);
        gate1.setStrokeWidth(3);
        disconnector2();
        circle1Paint();

    }

    void figure4() {
        Rectangle rectangle = new Rectangle(250, 115, 10000, 80);
        rectangle.setFill(Color.WHITE);
        linePainter(boldLine4, startX3, startY3, endX3, endY3, 3, "black");
        getChildren().add(rectangle);
//        linePainter(path6, 260, 400, 260, 150, 2, "gray");
//        linePainter(path7, 260, 150, 250, 150, 2, "gray");
        getChildren().add(path6);
        getChildren().add(path7);
        getChildren().add(gate4);
        gate4.setStrokeWidth(3);
        circle4Paint();
    }

    void figure2() {
        Rectangle rectangle = new Rectangle(280, 330, 70, 10000);
        rectangle.setFill(Color.WHITE);
        linePainter(boldLine5, startX4, startY4, endX4, endY4, 3, "black");
        arcDrawer(arc3, endX4, endY4 - 20, 20, 270, 180);
        linePainter(boldLine6, endX4, endY4 - 40, endX4, endY4 - 60, 3, "black");
        getChildren().add(rectangle);
        getChildren().add(path8);
        getChildren().add(path9);
        getChildren().add(path2);
        getChildren().add(gate2);
        gate2.setStrokeWidth(3);
        disconnector1();
        circle2Paint();
    }

    void circle4Paint() {
        circle4.setFill(Color.GRAY);
        getChildren().add(circle4);
    }

    void circle3Paint() {
        circle3.setFill(Color.GRAY);
        getChildren().add(circle3);
    }

    void circle2Paint() {
        circle2.setFill(Color.GRAY);
        getChildren().add(circle2);
    }

    void circle1Paint() {
        circle1.setFill(Color.GRAY);
        getChildren().add(circle1);
    }

    void disconnector1() {
        disCircle.setFill(Color.WHITE);
        disCircle.setStroke(Color.gray(0.4));
        disCircle.setStrokeWidth(3);
        getChildren().add(disCircle);

        disLine.setStrokeWidth(2);
        disLine.setStroke(Color.gray(0.4));
        getChildren().add(disLine);
    }

    void disconnector2() {
        disCircle2.setFill(Color.WHITE);
        disCircle2.setStroke(Color.gray(0.4));
        disCircle2.setStrokeWidth(3);
        getChildren().add(disCircle2);

        disLine2.setStrokeWidth(2);
        disLine2.setStroke(Color.gray(0.4));
        getChildren().add(disLine2);
    }

    private void rotateRotatingLine() {
        if (disLine.getStartX() == 110) {
            disLine.setStartX(130);
            disLine.setEndX(130);
            disLine.setStartY(320);
            disLine.setEndY(360);
            isVertical1 = true;

        } else {
            disLine.setStartX(110);
            disLine.setEndX(150);
            disLine.setStartY(340);
            disLine.setEndY(340);
            isVertical1 = false;

        }
    }

    public void rotateAction() {
        rotateAnimation = new Timeline(
                new KeyFrame(Duration.millis(1), e -> {
                    rotateRotatingLine();
                }));
        rotateAnimation.setCycleCount(1);
        rotateAnimation.play(); // Start animation

    }

    private void rotateRotatingLine2() {
        if (disLine2.getStartX() == 110) {
            disLine2.setStartX(130);
            disLine2.setEndX(130);
            disLine2.setStartY(240);
            disLine2.setEndY(280);
            isVertical2 = true;

        } else {
            disLine2.setStartX(110);
            disLine2.setEndX(150);
            disLine2.setStartY(260);
            disLine2.setEndY(260);
            isVertical2 = false;
        }
    }

    public void rotateAction2() {
        rotateAnimation2 = new Timeline(
                new KeyFrame(Duration.millis(1), e -> {
                    rotateRotatingLine2();
                }));
        rotateAnimation2.setCycleCount(1);
        rotateAnimation2.play(); // Start animation

    }
    void restartLevel(){
         startX1 = 140; startY1 = 100; endX1 = 170; endY1 = 100;
         startX2 = 190; startY2 = 250; endX2 = 190; endY2 = 170;
         startX3 = 250; startY3 = 150; endX3 = 190; endY3 = 150;
         startX4 = 300; startY4 = 330; endX4 = 300; endY4 = 120;
         path1.setOpacity(1);path2.setOpacity(1);path3.setOpacity(1);path4.setOpacity(1);path6.setOpacity(1);
        path7.setOpacity(1);path8.setOpacity(1);path9.setOpacity(1);shortPath1.setOpacity(1);shortPath2.setOpacity(1);
        circle1.setOpacity(1);circle2.setOpacity(1);circle3.setOpacity(1);circle4.setOpacity(1);
        gate1.setOpacity(1);gate2.setOpacity(1);gate3.setOpacity(1);gate4.setOpacity(1);
        gate1.setStartX(180);
        gate1.setEndX(200);
        gate2.setStartX(290);
        gate2.setEndX(310);
        gate3.setStartY(90);
        gate3.setEndY(110);
        gate4.setStartY(140);
        gate4.setEndY(160);
         paintLevel5();

    }
}

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;//270. datýra bak
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Level1 extends Drawings {
    public boolean isPushedBoldline2 = false;
    private double zero = 0 ;
    Text openingText;
    Line hLine;
    Arc semiCircle;
    Line hLineC;
    Line line;
    Line path1 = new Line(90,100,100,100), path2 = new Line(90,100,90,220),
    		path3 = new Line(90,220,400,220),path4 = new Line(320,200,320,250);
    Circle circle1 = new Circle(400, 220, 20);

    Circle circle2 = new Circle(320, 270, 20);
    Line gate1 = new Line(100, 93, 100, 107);
    Line gate2 = new Line(313, 200, 327, 200);// this is the vertical line

    Line line1 = new Line();

    private double startX = 100, startY = 100, endX = 300, endY = 100;
    private double startX2 = 320, startY2 = 97, endX2 = 320, endY2 = 200;

    public Level1() {


        openingText();


        paintLevel1();

        //text animation
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            if (openingText.getOpacity() < 0.8)
                openingText.setOpacity(openingText.getOpacity() + 0.15);
        }));
        animation.setCycleCount(20);
        animation.play(); // Start animation


        Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            openingText.setOpacity(openingText.getOpacity() - 0.05);
        }));
        animation2.setCycleCount(50);
        animation2.play(); // Start animation

       //--------------------------------------

        //animations for figure 1
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
        //--------------------------------------

        //animations for the circle
        Timeline animationCircle1 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle1.getRadius() + 1);
            paintLevel1();

        }));
        animationCircle1.setCycleCount(5);

        Timeline animationCircle12 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle1.getRadius() - 1);
            paintLevel1();

        }));
        animationCircle12.setCycleCount(5);
        animationCircle12.setDelay(Duration.millis(40));
        //------------------------------------------------------

        circle1.setOnMouseClicked(e -> { //animations in the case of successful push
            if (isPushedBoldline2) {
            	animationCircle1.play();
            	animationCircle12.play();
            	animation3.play(); // Start animation
            	animation4.play();
            	//disappearing gate and path
                FadeTransition fade = new FadeTransition(Duration.millis(1600), gate1);
                fade.setDelay(Duration.millis(1600));
                fade.setFromValue(1);
                fade.setToValue(0);
                fade.play();

                FadeTransition fade2 = new FadeTransition(Duration.millis(1600), path1);
                fade2.setDelay(Duration.millis(1600));
                fade2.setFromValue(1);
                fade2.setToValue(0);
                fade2.play();

                FadeTransition fade3 = new FadeTransition(Duration.millis(1600), path2);
                fade3.setDelay(Duration.millis(1600));
                fade3.setFromValue(1);
                fade3.setToValue(0);
                fade3.play();

                FadeTransition fade4 = new FadeTransition(Duration.millis(1600), path3);
                fade4.setDelay(Duration.millis(1600));
                fade4.setFromValue(1);
                fade4.setToValue(0);
                fade4.play();

                FadeTransition fade5 = new FadeTransition(Duration.millis(1600), circle1);
                fade5.setDelay(Duration.millis(1600));
                fade5.setFromValue(1);
                fade5.setToValue(0);
                fade5.play();
                
                Timeline animationC = new Timeline(new KeyFrame(Duration.millis(20), f -> {
                	

                }));
                animationC.setCycleCount(50);
                animationC.play();
                //----------------------------------------------------




            } else {
            	//animation for collision
                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate1.setStartY(gate1.getStartY() - 1);
                    gate1.setEndY(gate1.getEndY() + 1);
                    startX += -1;
                    endX += -1;
                    paintLevel1();
                }));
                broke.setCycleCount(17);


                //animation 2 for collision
                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startX += 1;
                    endX += 1;
                    paintLevel1();
                }));
                broke2.setCycleCount(10);

                //the animation is for restart the level in the case of fail
                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
    				gate1.setStartY(93);
    				gate1.setEndY(107);
                    restartLevel();
                    paintLevel1();
                }));
                restart.setCycleCount(1);
                restart.setDelay(Duration.millis(1800));
                //this animation fades the pane
                FadeTransition fade = new FadeTransition(Duration.millis(2000), this);
                fade.setFromValue(1);
                fade.setToValue(0);
                fade.setDelay(Duration.millis(200));
                // this animation brighten the pane
                FadeTransition fade2 = new FadeTransition(Duration.millis(2000), this);
                fade2.setFromValue(0);
                fade2.setToValue(1);
                fade2.setDelay(Duration.millis(2250));

                //play the action
                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke, broke2,restart);
                seq.play();
                fade.play();
                fade2.play();
				startX = 100; startY = 100; endX = 300; endY = 100;
				gate1.setStartY(93);
				gate1.setEndY(107);


            }

        });
        //------------------------------------------------
        
        //animations for circle 2 action
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
            fade.setDelay(Duration.millis(200));
            fade.setFromValue(1);
            fade.setToValue(0);
            fade.play();
            
            FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path4);
            fade2.setDelay(Duration.millis(200));
            fade2.setFromValue(1);
            fade2.setToValue(0);
            fade2.play();
            
            FadeTransition fade3 = new FadeTransition(Duration.millis(2000), circle2);
            fade3.setDelay(Duration.millis(200));
            fade3.setFromValue(1);
            fade3.setToValue(0);
            fade3.play();
        });


    }

    public void paintLevel1() {

    	//rectangle that is at the most bottom
        Rectangle rectangle3 = new Rectangle(0, 0, 800, 500);
        rectangle3.setFill(Color.WHITE);


        // white rectangle
        Rectangle rectangle = new Rectangle(0, 0, 100, 150);
        rectangle.setFill(Color.WHITE);

        Rectangle rectangle2 = new Rectangle(270, 200, 100, 150);
        rectangle2.setFill(Color.WHITE);


        getChildren().clear();
        getChildren().add(rectangle3);

        linePainter(hLine, startX, startY, endX, endY, 3, "black");
        arcDrawer(semiCircle, startX + 220, startY, 20, 360, 180);
        linePainter(hLineC, startX + 240, startY, endX + 80, endY, 3, "black");


        linePainter(line, startX2, startY2, endX2, endY2, 3, "black");

        getChildren().add(rectangle);
        getChildren().add(rectangle2);
        getChildren().add(path1);//bunlarý ekledim
        getChildren().add(path2);//linepainterarý sildim
        getChildren().add(path3);//yukarýda initialize ettim
        getChildren().add(path4);

        paintCircle1();

        paintCircle2();
        paintGate();
        paintGate2();


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

    void openingText() {
        openingText = new Text(180, 50, "Level 1");
        openingText.setFont(Font.font("Times New Roman", 25));
        getChildren().add(openingText);
        openingText.setOpacity(0);

    }





}



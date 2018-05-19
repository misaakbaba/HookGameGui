import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class level5 extends Drawings {
	boolean isPushedBoldLine1 = false , isPushedBoldLine2 = false  ,isPushedBoldLine3 = false  ,isPushedBoldLine4 = false ;
	Timeline rotateAnimation;
	Timeline rotateAnimation2;
	boolean isVertical1 = true,isVertical2 = true ;
    Circle circle3 = new Circle(130, 400, 20), circle1 = new Circle(50, 260, 20),
            circle4 = new Circle(260, 400, 20), circle2 = new Circle(50, 340, 20);
    private double startX1 = 140, startY1 = 100, endX1 = 170, endY1 = 100;
    private double startX2 = 190, startY2 = 250, endX2 = 190, endY2 = 170;
    private double startX3 = 250, startY3 = 150, endX3 = 190, endY3 = 150;
    private double startX4 = 300, startY4 = 330, endX4 = 300, endY4 = 120;
    private Line path1 = new Line(130, 400, 130, 100), path2 = new Line(50, 340, 130, 340),
            path3 = new Line(50, 260, 130, 260),
            path4 = new Line(130, 260, 190, 260), path6 = new Line(260, 400, 260, 150),
            path7 = new Line(260, 150, 250, 150), path8 = new Line(150, 340, 300, 340),
            path9 = new Line(300, 340, 300, 330), disLine = new Line(130, 320, 130, 360), disLine2 = new Line(130, 240, 130, 280),
            shortPath1 = new Line(130, 100, 140, 100), shortPath2;
    private Circle disCircle = new Circle(130, 340, 20), disCircle2 = new Circle(130, 260, 20);
    private Line boldLine1, boldLine2, boldLine3, boldLine4, boldLine5, boldLine6,boldLine7;
    private Arc arc1 = new Arc(endX1 + 20, endY1, 20, 20, 360, 180),
            arc2 = new Arc(endX2, endY2 - 20, 20, 20, 270, -180),
            arc3 = new Arc(endX4, endY4 - 20, 20, 20, 270, 180);
    private Line gate3 = new Line(140, 90, 140, 110), gate1 = new Line(180, 250, 200, 250),
    		gate2 = new Line(290, 330, 310, 330), gate4 = new Line(250, 140, 250, 160);


    public level5() {
       paintLevel5();

       disCircle.setOnMouseClicked(e -> {
    	   rotateAction();
       });

       disCircle2.setOnMouseClicked(e -> {
    	   rotateAction2();
       });

//      circle1.setOnMouseClicked(e -> {
//    	   if (isVertical1) {
//    		   if (true/*isPushedBoldLine4*/) {
//    			   Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(10), ev -> {
//    		        	startY1 += 1;
//    		        	endY1 += 1;
//    		        	paintLevel5();
//
//    		        }));
//    		        animation1.setCycleCount(200);

//    		        Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), ev -> {
//    		            gate1.setStartX(gate1.getStartX() - 1);
//    		            gate1.setEndX(gate1.getEndX() + 1);
//    		            paintLevel5();
//    		        }));
//    		        animation2.setCycleCount(15);
//
//    		        Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(10), ev -> {
//    		            gate1.setStartX(gate1.getStartX() + 1);
//    		            gate1.setEndX(gate1.getEndX() - 1);
//    		            paintLevel5();
//    		        }));
//    		        animation3.setCycleCount(15);
//    		        animation3.setDelay(Duration.millis(1500));
//
//    		        //------------------------------------
//
//    		        //animations for the circle
//    		        Timeline animationCircle1 = new Timeline(new KeyFrame(Duration.millis(20), ev -> {
//    		        	circle1.setRadius(circle1.getRadius() + 1);
//    		            paintLevel5();
//
//    		        }));
//    		        animationCircle1.setCycleCount(5);
//
//    		        Timeline animationCircle12 = new Timeline(new KeyFrame(Duration.millis(20), ev -> {
//    		        	circle1.setRadius(circle1.getRadius() - 1);
//    		            paintLevel5();
//
//    		        }));
//    		        animationCircle12.setCycleCount(5);
//    		        animationCircle12.setDelay(Duration.millis(40));
    		        //------------------------------------------------------
//    		        animation1.play();
//    		        animation2.play();
//    		        animation3.play();
//    		        animationCircle1.play();
//    		        animationCircle12.play();

//			}
//
//
//
//
//		}
//
//       });







    }
    void paintLevel5(){
        figure3();
        figure1();
        figure4();
        figure2();
    }

    void figure3() {
        Rectangle rectangle=new Rectangle(0,50,140,100);
        rectangle.setFill(Color.WHITE);
        getChildren().add(rectangle);
        getChildren().add(path1);
        getChildren().add(shortPath1);
        circle3Paint();
        getChildren().add(gate3);
        gate3.setStrokeWidth(3);
        linePainter(boldLine1, startX1, startY1, endX1, endY1, 3, "black");
        linePainter(boldLine2, startX1 + 70, startY1, endX1 + 135, endY1, 3, "black");
        arcDrawer(arc1, endX1 + 20, endY1, 20, 360, 180);

    }


    void figure1() {
        Rectangle rectangle = new Rectangle(150,250,100,1000);
        rectangle.setFill(Color.WHITE);
        getChildren().add(rectangle);
        circle1Paint();
        linePainter(path3, 50, 260, 130, 260, 2, "gray");
        linePainter(path4, 130, 260, 190, 260, 2, "gray");
        disconnector2();
        linePainter(shortPath2, 190, 260, 190, 250, 2, "gray");
        linePainter(boldLine3, startX2, startY2, endX2, endY2, 3, "black");
        arcDrawer(arc2, endX2, endY2 - 20, 20, 270, -180);
        linePainter(boldLine7, endX2, endY2 - 40, endX2, endY2 - 70, 3, "black");
        getChildren().add(gate1);
        gate1.setStrokeWidth(3);

    }

    void figure4() {
        Rectangle rectangle=new Rectangle(250,115,10000,80);
        rectangle.setFill(Color.WHITE);
        circle4Paint();
        linePainter(boldLine4, startX3, startY3, endX3, endY3, 3, "black");
        getChildren().add(rectangle);
        linePainter(path6, 260, 400, 260, 150, 2, "gray");
        linePainter(path7, 260, 150, 250, 150, 2, "gray");
        getChildren().add(gate4);
        gate4.setStrokeWidth(3);
    }

    void figure2() {
        Rectangle rectangle=new Rectangle(280,330,70,10000);
        rectangle.setFill(Color.WHITE);
        getChildren().add(rectangle);
        getChildren().add(path2);
        disconnector1();
        getChildren().add(path8);
        linePainter(boldLine5, startX4, startY4, endX4, endY4, 3, "black");
        getChildren().add(path9);
        arcDrawer(arc3, endX4, endY4 - 20, 20, 270, 180);
        linePainter(boldLine6, endX4, endY4 - 40, endX4, endY4 - 60, 3, "black");
        getChildren().add(gate2);
        gate2.setStrokeWidth(3);
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
		if(disLine.getStartX() == 110){
			disLine.setStartX(130);
			disLine.setEndX(130);
			disLine.setStartY(320);
			disLine.setEndY(360);
			isVertical2 = true;
		}
		else {
			disLine.setStartX(110);
			disLine.setEndX(150);
			disLine.setStartY(340);
			disLine.setEndY(340);
			isVertical1 = false;
		}
	}

	public void rotateAction() {
	    rotateAnimation = new Timeline(
	    	      new KeyFrame(Duration.millis(1),e -> {
                      rotateRotatingLine();
	    	      }));
	    rotateAnimation.setCycleCount(1);
	    rotateAnimation.play(); // Start animation

	}

	private void rotateRotatingLine2() {
		if(disLine2.getStartX() == 110){
			disLine2.setStartX(130);
			disLine2.setEndX(130);
			disLine2.setStartY(240);
			disLine2.setEndY(280);
			isVertical1 = true;
		}
		else {
			disLine2.setStartX(110);
			disLine2.setEndX(150);
			disLine2.setStartY(260);
			disLine2.setEndY(260);
			isVertical1 = false;
		}
	}

	public void rotateAction2() {
	    rotateAnimation2 = new Timeline(
	    	      new KeyFrame(Duration.millis(1),e -> {
                      rotateRotatingLine2();
	    	      }));
	    rotateAnimation2.setCycleCount(1);
	    rotateAnimation2.play(); // Start animation

	}
}

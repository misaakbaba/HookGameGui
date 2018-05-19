import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class Level3 extends Pane {
	boolean isPushedBoldLine1 = false , isPushedBoldLine2 = false , isPushedBoldLine3 = false;
	private double startX = 200 , startY = 100 , endX = 400 , endY = 100 ,
	startX2 = 200 , startY2 = 100 , endX2 = 400 , endY2 = 100 ,
	startX3 = 200 , startY3 = 100 , endX3 = 400 , endY3 = 100 ;
	
	//paths
	Line path1 = new Line(190,100,198,100), path2 = new Line(190,100,190,370),//path1
			path3 = new Line(420,283,420,290), path4 = new Line(50,290,420,290),//path2
			path5 = new Line(240,190,248,190), path6 = new Line(240,190,240,330), path7 = new Line(120,330,240,330);//path3
	//circles
	Circle circle1 = new Circle(30,290,20);
	Circle circle2 = new Circle(100,330,20);
	Circle circle3 = new Circle(190,390,20);
	//gates
	Line gate3 = new Line(197, 93, 197, 107), gate1 = new Line(413, 283, 427, 283), gate2 = new Line(247, 183, 247, 197);

	public Level3() {
		// TODO Auto-generated constructor stub
		paintLevel3();
		
		//animations for the figure 1 push
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startY += 1;
        	endY += 1;
        	paintLevel3();

        }));
        animation.setCycleCount(200);
 
        Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate1.setStartX(gate1.getStartX() - 1);
            gate1.setEndX(gate1.getEndX() + 1);
            paintLevel3();
        }));
        animation2.setCycleCount(15);
        
        Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate1.setStartX(gate1.getStartX() + 1);
            gate1.setEndX(gate1.getEndX() - 1);
            paintLevel3();
        }));
        animation3.setCycleCount(15);
        animation3.setDelay(Duration.millis(1500));
        
        //------------------------------------
        
        //animations for the circle
        Timeline animationCircle1 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle1.getRadius() + 1);
            paintLevel3();

        }));
        animationCircle1.setCycleCount(5);

        Timeline animationCircle12 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle1.getRadius() - 1);
            paintLevel3();

        }));
        animationCircle12.setCycleCount(5);
        animationCircle12.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle1.setOnMouseClicked(e -> {
        	if (isPushedBoldLine2) {
        		isPushedBoldLine1 = true;
            	animation.play();
            	animation2.play();
            	animation3.play();
            	animationCircle12.play();
            	animationCircle1.play();
            	//fading animations    	
            	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate1);
            	fade1.setDelay(Duration.millis(900));
                fade1.setFromValue(1);
                fade1.setToValue(0);
            	fade1.play();
            	
            	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path3);
            	fade2.setDelay(Duration.millis(900));
                fade2.setFromValue(1);
                fade2.setToValue(0);
            	fade2.play();
            	
            	FadeTransition fade3 = new FadeTransition(Duration.millis(2000), path4);
            	fade3.setDelay(Duration.millis(900));
                fade3.setFromValue(1);
                fade3.setToValue(0);
            	fade3.play();
            	
            	FadeTransition fade4 = new FadeTransition(Duration.millis(2000), circle1);
            	fade4.setDelay(Duration.millis(900));
                fade4.setFromValue(1);
                fade4.setToValue(0);
            	fade4.play();
			}
        	else{
            	//animation for collision
                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate1.setStartX(gate1.getStartX() - 1);
                    gate1.setEndX(gate1.getEndX() + 1);
                    startY += 1;
                    endY += 1;
                    paintLevel3();
                }));
                broke.setCycleCount(17);;
                
                //animation 2 for collision
                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startY += -1;
                    endY += -1;
                    paintLevel3();
                }));
                broke2.setCycleCount(10);
                                
                //the animation is for restart the level in the case of fail
                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                	gate1.setStartX(413);
                	gate1.setEndX(427);
                    restartLevel();
                    paintLevel3();
                }));
                restart.setCycleCount(1);
                restart.setDelay(Duration.millis(1800));
                
                //this animation fades the pane
                FadeTransition fade = new FadeTransition(Duration.millis(2000), this);
                fade.setFromValue(1);
                fade.setToValue(0);
                fade.setDelay(Duration.millis(200));
                // this animation brightens the pane
                FadeTransition fade2 = new FadeTransition(Duration.millis(2000), this);
                fade2.setFromValue(0);
                fade2.setToValue(1);
                fade2.setDelay(Duration.millis(2250));
                
                //play the action
                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke, broke2,restart);
        		animationCircle1.play();
        		animationCircle12.play();
                seq.play();
                fade.play();
                fade2.play();
        	}       	
        });
        //---------------------------------------------------
        
		//animations for the figure 2 push
        Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startX2 -= 1;
        	endX2 -= 1;
        	paintLevel3();

        }));
        animation4.setCycleCount(200);
        
        Timeline animation5 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate2.setStartY(gate2.getStartY() - 1);
            gate2.setEndY(gate2.getEndY() + 1);
            paintLevel3();
        }));
        animation5.setCycleCount(15);
        
        Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate2.setStartY(gate2.getStartY() + 1);
            gate2.setEndY(gate2.getEndY() - 1);
            paintLevel3();
        }));
        animation6.setCycleCount(15);
        animation6.setDelay(Duration.millis(1700));
        
        //------------------------------------
        
        //animations for the circle
        Timeline animationCircle2 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle2.setRadius(circle2.getRadius() + 1);
            paintLevel3();

        }));
        animationCircle2.setCycleCount(5);

        Timeline animationCircle22 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle2.setRadius(circle2.getRadius() - 1);
            paintLevel3();

        }));
        animationCircle22.setCycleCount(5);
        animationCircle22.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle2.setOnMouseClicked(e -> {
        	isPushedBoldLine2 = true;
        	animation4.play();
        	animation5.play();
        	animation6.play();
        	animationCircle2.play();
        	animationCircle22.play();
        	//fading animations    	
        	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate2);
        	fade1.setDelay(Duration.millis(1700));
            fade1.setFromValue(1);
            fade1.setToValue(0);
        	fade1.play();
        	
        	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path5);
        	fade2.setDelay(Duration.millis(1700));
            fade2.setFromValue(1);
            fade2.setToValue(0);
        	fade2.play();
        	
        	FadeTransition fade3 = new FadeTransition(Duration.millis(2000), path6);
        	fade3.setDelay(Duration.millis(1700));
            fade3.setFromValue(1);
            fade3.setToValue(0);
        	fade3.play();
        	
        	FadeTransition fade4 = new FadeTransition(Duration.millis(2000), path7);
        	fade4.setDelay(Duration.millis(1700));
            fade4.setFromValue(1);
            fade4.setToValue(0);
        	fade4.play();
        	
        	FadeTransition fade5 = new FadeTransition(Duration.millis(2000), circle2);
        	fade5.setDelay(Duration.millis(1700));
            fade5.setFromValue(1);
            fade5.setToValue(0);
        	fade5.play();
        });
        //---------------------------------------
        
    	//animations for the figure 1 push
        Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startX3 -= 1;
        	endX3 -= 1;
        	paintLevel3();

        }));
        animation7.setCycleCount(300);
        
        Timeline animation8 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate3.setStartY(gate3.getStartY() - 1);
            gate3.setEndY(gate3.getEndY() + 1);
            paintLevel3();
        }));
        animation8.setCycleCount(15);
        
        Timeline animation9 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate3.setStartY(gate3.getStartY() + 1);
            gate3.setEndY(gate3.getEndY() - 1);
            paintLevel3();
        }));
        animation9.setCycleCount(15);
        animation9.setDelay(Duration.millis(2700));
        
        //------------------------------------
        
        //animations for the circle
        Timeline animationCircle3 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle3.setRadius(circle2.getRadius() + 1);
            paintLevel3();

        }));
        animationCircle3.setCycleCount(5);

        Timeline animationCircle32 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle3.setRadius(circle2.getRadius() - 1);
            paintLevel3();

        }));
        animationCircle32.setCycleCount(5);
        animationCircle32.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle3.setOnMouseClicked(e -> {
        	if (isPushedBoldLine1) {
				isPushedBoldLine3 = true;
				animation7.play();
				animation8.play();
				animation9.play();
				animationCircle3.play();
				animationCircle32.play();	
            	//fading animations    	
            	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate3);
            	fade1.setDelay(Duration.millis(2700));
                fade1.setFromValue(1);
                fade1.setToValue(0);
            	fade1.play();
            	
            	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path1);
            	fade2.setDelay(Duration.millis(2700));
                fade2.setFromValue(1);
                fade2.setToValue(0);
            	fade2.play();
            	
            	FadeTransition fade3 = new FadeTransition(Duration.millis(2000), path2);
            	fade3.setDelay(Duration.millis(2700));
                fade3.setFromValue(1);
                fade3.setToValue(0);
            	fade3.play();
            	
            	FadeTransition fade4 = new FadeTransition(Duration.millis(2000), circle3);
            	fade4.setDelay(Duration.millis(2700));
                fade4.setFromValue(1);
                fade4.setToValue(0);
            	fade4.play();
				
			}
        	else{
            	//animation for collision
                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate3.setStartY(gate3.getStartY() - 1);
                    gate3.setEndY(gate3.getEndY() + 1);
                    startX3 -= 1;
                    endX3 -= 1;
                    paintLevel3();
                }));
                broke.setCycleCount(17);;
                
                //animation 2 for collision
                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startX3 += 1;
                    endX3 += 1;
                    paintLevel3();
                }));
                broke2.setCycleCount(10);
                                
                //the animation is for restart the level in the case of fail
                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                	gate3.setStartY(93);
                	gate3.setEndY(107);
                    restartLevel();
                    paintLevel3();
                }));
                restart.setCycleCount(1);
                restart.setDelay(Duration.millis(1800));
                
                //this animation fades the pane
                FadeTransition fade = new FadeTransition(Duration.millis(2000), this);
                fade.setFromValue(1);
                fade.setToValue(0);
                fade.setDelay(Duration.millis(200));
                // this animation brightens the pane
                FadeTransition fade2 = new FadeTransition(Duration.millis(2000), this);
                fade2.setFromValue(0);
                fade2.setToValue(1);
                fade2.setDelay(Duration.millis(2250));
                
                //play the action
                SequentialTransition seq = new SequentialTransition();
                seq.getChildren().addAll(broke, broke2,restart);
        		animationCircle3.play();
        		animationCircle32.play();
                seq.play();
                fade.play();
                fade2.play();
        	}    	
        	
        });
        

	}


	public void paintLevel3() {
		Rectangle rec1 = new Rectangle(0,70,198,50);
		rec1.setFill(Color.WHITE);
		Rectangle rec2 = new Rectangle(0,170,248,50);
		rec2.setFill(Color.WHITE);
		Rectangle rec3 = new Rectangle(402,282,50,800);
		rec3.setFill(Color.WHITE);
		Rectangle rec4 = new Rectangle(0,0,500,800);
		rec4.setFill(Color.WHITE);



		getChildren().clear();
		getChildren().add(rec4);
		paintBoldLine();
		paintBoldLine2();
		paintBoldLine3();
		getChildren().add(rec1);
		getChildren().add(rec2);
		getChildren().add(rec3);
		getChildren().add(path1);
		getChildren().add(path2);;
		getChildren().add(path3);
		getChildren().add(path4);
		getChildren().add(path5);
		getChildren().add(path6);
		getChildren().add(path7);
		paintCircle();
		paintCircle2();
		paintCircle3();
		paintGate();
		paintGate2();
		paintGate3();

	}

	private void paintBoldLine3() {
		Line line = new Line(startX3,startY3,endX3,endY3);
        line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX3 + 220 ,startY3,20,20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX3 + 240,startY3 ,endX3 + 80,endY3);
        line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);


		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}

	private void paintBoldLine() {
		Line line = new Line(startX + 220,startY - 3,endX + 20,endY+ 70);
        line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);
		
		Arc semiCircle = new Arc(startX + 220 ,startY + 90,20,20, 270, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);
		
		Line line2 = new Line(startX + 220 ,startY + 110,endX + 20,endY + 180);
        line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);


		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}
	
	private void paintBoldLine2() {
		Line line = new Line(startX2 + 50 ,startY2 + 90,endX2 + 23,endY2 + 90);
        line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);
		
		getChildren().add(line);
	}
	
	private void paintGate() {
		gate1.setStrokeWidth(3);
		gate1.setStroke(Color.BLACK);	
		getChildren().add(gate1);
	}
	
	private void paintGate2() {
		gate2.setStrokeWidth(3);
		gate2.setStroke(Color.BLACK);		
		getChildren().add(gate2);
	}
	
	private void paintGate3 () {
		gate3.setStrokeWidth(3);
		gate3.setStroke(Color.BLACK);	
		getChildren().add(gate3);
	}


	private void paintCircle() {
		circle1.setFill(Color.GRAY);
		getChildren().add(circle1);
	}

	private void paintCircle2() {
		circle2.setFill(Color.GRAY);
		getChildren().add(circle2);
	}
	
	private void paintCircle3() {		
		circle3.setFill(Color.GRAY);
		getChildren().add(circle3);
	}
	
	void restartLevel() {
	startX = 200 ; startY = 100 ; endX = 400 ; endY = 100 ;
	startX2 = 200 ; startY2 = 100 ; endX2 = 400 ; endY2 = 100 ;
	startX3 = 200 ; startY3 = 100 ; endX3 = 400 ; endY3 = 100 ;
	path1.setOpacity(1); path2.setOpacity(1); path3.setOpacity(1); path4.setOpacity(1); path5.setOpacity(1); path6.setOpacity(1); path7.setOpacity(1);
	circle1.setOpacity(1); circle2.setOpacity(1); circle3.setOpacity(1);
	gate1.setOpacity(1); gate2.setOpacity(1); gate3.setOpacity(1);
    paintLevel3();
    isPushedBoldLine1 = false; isPushedBoldLine2 = false; isPushedBoldLine3 = false;
}


}
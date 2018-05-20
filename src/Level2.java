import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
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

public class Level2 extends Pane {
	public boolean isPushedBoldLine1 = false , isPushedBoldLine2 = false , isPushedBoldLine3 = false , isPushedBoldLine4 = false ;
	
	private double startX = 200, startY = 250, endX = 200, endY = 300,
	startX2 = 200, startY2 = 250, endX2 = 200, endY2 = 300,
	startX3 = 200, startY3 = 250, endX3 = 200, endY3 = 300,
	startX4 = 200, startY4 = 250, endX4 = 200, endY4 = 300;
	//lines for the path1
	Line path1 = new Line(107, 150, 117, 150), path2 = new Line(107, 150, 107, 375),
			path3 = new Line(200, 303, 200, 375),//path 2
			path4 = new Line(273, 303, 273, 375),//path 3
			path5 = new Line(403, 230, 420, 230),path6 = new Line(420, 230, 420, 375);//path4
	//circles	
	Circle circle1 = new Circle(107, 395, 20);
	Circle circle2 = new Circle(200, 395, 20);
	Circle circle3 = new Circle(273, 395, 20);
	Circle circle4 = new Circle(420, 395, 20);
	//gates
	Line gate1 = new Line(117, 143, 117, 157);// this is the vertical line that is between
	Line gate2 = new Line(193, 303, 207, 303);// this is the vertical line that is between
	Line gate3 = new Line(266, 303, 280, 303);// this is the vertical line that is between
	Line gate4 = new Line(403, 223, 403, 237);// this is the vertical line that is between

	public Level2() {
		// TODO Auto-generated constructor stub
		paintLevel2();
		
		//animations for the figure 1 push
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startX -= 1;
        	endX -= 1;
        	paintLevel2();

        }));
        animation.setCycleCount(100);
        
        Timeline animation2 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate1.setStartY(gate1.getStartY() - 1);
            gate1.setEndY(gate1.getEndY() + 1);
            paintLevel2();
        }));
        animation2.setCycleCount(15);
        
        Timeline animation3 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate1.setStartY(gate1.getStartY() + 1);
            gate1.setEndY(gate1.getEndY() - 1);
            paintLevel2();
        }));
        animation3.setCycleCount(15);
        animation3.setDelay(Duration.millis(900));
        
        //------------------------------------
        
        //animations for the circle
        Timeline animationCircle1 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle1.getRadius() + 1);
            paintLevel2();

        }));
        animationCircle1.setCycleCount(5);

        Timeline animationCircle12 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle1.getRadius() - 1);
            paintLevel2();

        }));
        animationCircle12.setCycleCount(5);
        animationCircle12.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle1.setOnMouseClicked(e -> {
        	isPushedBoldLine1 = true ;
        	animation.play();
        	animation2.play();
        	animation3.play();
        	animationCircle1.play();
        	animationCircle12.play();
        	
        	//fading animations    	
        	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate1);
        	fade1.setDelay(Duration.millis(900));
            fade1.setFromValue(1);
            fade1.setToValue(0);
        	fade1.play();
        	
        	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path1);
        	fade2.setDelay(Duration.millis(900));
            fade2.setFromValue(1);
            fade2.setToValue(0);
        	fade2.play();
        	
        	FadeTransition fade3 = new FadeTransition(Duration.millis(2000), path2);
        	fade3.setDelay(Duration.millis(900));
            fade3.setFromValue(1);
            fade3.setToValue(0);
        	fade3.play();
        	
        	FadeTransition fade4 = new FadeTransition(Duration.millis(2000), circle1);
        	fade4.setDelay(Duration.millis(900));
            fade4.setFromValue(1);
            fade4.setToValue(0);
        	fade4.play();
        	
        	
        });
        //------------------------------------
        
        
        
        //animations figure2
        Timeline animation4 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startY2 += 1;
        	endY2 += 1;
        	paintLevel2();

        }));
        animation4.setCycleCount(205);
        
        Timeline animation5 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate2.setStartX(gate2.getStartX() - 1);
            gate2.setEndX(gate2.getEndX() + 1);
            paintLevel2();
        }));
        animation5.setCycleCount(15);
        
        Timeline animation6 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate2.setStartX(gate2.getStartX() + 1);
            gate2.setEndX(gate2.getEndX() - 1);
            paintLevel2();
        }));
        animation6.setCycleCount(15);
        animation6.setDelay(Duration.millis(2200));
        //-------------------------------------
        
        //animations for the circle
        Timeline animationCircle2 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle2.setRadius(circle3.getRadius() + 1);
            paintLevel2();

        }));
        animationCircle2.setCycleCount(5);

        Timeline animationCircle22 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle2.setRadius(circle3.getRadius() - 1);
            paintLevel2();

        }));
        animationCircle22.setCycleCount(5);
        animationCircle22.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle2.setOnMouseClicked(e -> {
        	if (isPushedBoldLine1 && isPushedBoldLine4) {
        		isPushedBoldLine2 = true;
        		animationCircle2.play();
        		animationCircle22.play();
            	animation4.play();
            	animation5.play();
            	animation6.play();
            	
            	//fading animations for figure2
            	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate2);
            	fade1.setDelay(Duration.millis(2200));
                fade1.setFromValue(1);
                fade1.setToValue(0);
            	fade1.play();
            	
            	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path3);
            	fade2.setDelay(Duration.millis(2200));
                fade2.setFromValue(1);
                fade2.setToValue(0);
            	fade2.play();
            	
            	FadeTransition fade4 = new FadeTransition(Duration.millis(2000), circle2);
            	fade4.setDelay(Duration.millis(2200));
                fade4.setFromValue(1);
                fade4.setToValue(0);
            	fade4.play();          	
            	fade4.setOnFinished(event -> {
            		Level3 l3=new Level3();
            		getChildren().clear();
					l3.setOpacity(0);
					getChildren().add(l3);
					FadeTransition fadeTransition=new FadeTransition(Duration.millis(2000),l3);
					fadeTransition.setFromValue(0);
					fadeTransition.setToValue(1);
					fadeTransition.play();
				});
			}
        	else{
            	//animation for collision
                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate2.setStartX(gate2.getStartX() - 1);
                    gate2.setEndX(gate2.getEndX() + 1);
                    startY2 += 1;
                    endY2 += 1;
                    paintLevel2();
                }));
                broke.setCycleCount(17);;
                
                //animation 2 for collision
                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startY2 += -1;
                    endY2 += -1;
                    paintLevel2();
                }));
                broke2.setCycleCount(10);
                                
                //the animation is for restart the level in the case of fail
                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                	gate2.setStartX(193);
                	gate2.setEndX(207);
                    restartLevel();
                    paintLevel2();
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
        		animationCircle2.play();
        		animationCircle22.play();
                seq.play();
                fade.play();
                fade2.play();
            }        	
        });
        //-----------------------------------------
        
        //animations for figure3
        Timeline animation7 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startY3 += 1;
        	endY3 += 1;
        	paintLevel2();

        }));
        animation7.setCycleCount(100);
        
        Timeline animation8 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate3.setStartX(gate3.getStartX() - 1);
            gate3.setEndX(gate3.getEndX() + 1);
            paintLevel2();
        }));
        animation8.setCycleCount(15);
        
        Timeline animation9 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate3.setStartX(gate3.getStartX() + 1);
            gate3.setEndX(gate3.getEndX() - 1);
            paintLevel2();
        }));
        animation9.setCycleCount(15);
        animation9.setDelay(Duration.millis(900));
        
        //------------------------------------
        
        //animations for the circle
        Timeline animationCircle3 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle3.setRadius(circle3.getRadius() + 1);
            paintLevel2();

        }));
        animationCircle3.setCycleCount(5);

        Timeline animationCircle32 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle3.setRadius(circle3.getRadius() - 1);
            paintLevel2();

        }));
        animationCircle32.setCycleCount(5);
        animationCircle32.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle3.setOnMouseClicked(e -> {
        	isPushedBoldLine3 = true ;
        	animation7.play();
        	animation8.play();
        	animation9.play();
        	animationCircle3.play();
        	animationCircle32.play();
        	//fading animations
        	
        	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate3);
        	fade1.setDelay(Duration.millis(900));
            fade1.setFromValue(1);
            fade1.setToValue(0);
        	fade1.play();
        	
        	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path4);
        	fade2.setDelay(Duration.millis(900));
            fade2.setFromValue(1);
            fade2.setToValue(0);
        	fade2.play();
        	
        	FadeTransition fade3 = new FadeTransition(Duration.millis(2000), circle3);
        	fade3.setDelay(Duration.millis(900));
            fade3.setFromValue(1);
            fade3.setToValue(0);
        	fade3.play();
 
        	
        });
        //------------------------------------
        
        
		//animations for the figure 1 push
        Timeline animation10 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
        	startX4 += 1;
        	endX4 += 1;
        	paintLevel2();

        }));
        animation10.setCycleCount(300);
        
        Timeline animation11 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate4.setStartY(gate4.getStartY() - 1);
            gate4.setEndY(gate4.getEndY() + 1);
            paintLevel2();
        }));
        animation11.setCycleCount(15);
        
        Timeline animation12 = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            gate4.setStartY(gate4.getStartY() + 1);
            gate4.setEndY(gate4.getEndY() - 1);
            paintLevel2();
        }));
        animation12.setCycleCount(15);
        animation12.setDelay(Duration.millis(1900));
        
        //------------------------------------
        
        //animations for the circle
        Timeline animationCircle4 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle4.getRadius() + 1);
            paintLevel2();

        }));
        animationCircle4.setCycleCount(5);

        Timeline animationCircle42 = new Timeline(new KeyFrame(Duration.millis(20), e -> {
        	circle1.setRadius(circle4.getRadius() - 1);
            paintLevel2();

        }));
        animationCircle42.setCycleCount(5);
        animationCircle42.setDelay(Duration.millis(40));
        //------------------------------------------------------
        
        circle4.setOnMouseClicked(e -> {
        	
        	if (isPushedBoldLine3) {
            	isPushedBoldLine4 = true ;
            	animation10.play();
            	animation11.play();
            	animation12.play();
            	animationCircle4.play();
            	animationCircle42.play();
            	//fading animations
            	
            	FadeTransition fade1 = new FadeTransition(Duration.millis(2000), gate4);
            	fade1.setDelay(Duration.millis(1900));
                fade1.setFromValue(1);
                fade1.setToValue(0);
            	fade1.play();
            	
            	FadeTransition fade2 = new FadeTransition(Duration.millis(2000), path5);
            	fade2.setDelay(Duration.millis(1900));
                fade2.setFromValue(1);
                fade2.setToValue(0);
            	fade2.play();
            	
            	FadeTransition fade3 = new FadeTransition(Duration.millis(2000), path6);
            	fade3.setDelay(Duration.millis(1900));
                fade3.setFromValue(1);
                fade3.setToValue(0);
            	fade3.play();        	
            	
            	FadeTransition fade4 = new FadeTransition(Duration.millis(2000), circle4);
            	fade4.setDelay(Duration.millis(1900));
                fade4.setFromValue(1);
                fade4.setToValue(0);
            	fade4.play();
			}
        	else {
        		//animation for collision
                Timeline broke = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    gate4.setStartY(gate4.getStartY() - 1);
                    gate4.setEndY(gate4.getEndY() + 1);
                    startX4 += 1;
                    endX4 += 1;
                    paintLevel2();
                }));
                broke.setCycleCount(17);;
                
                //animation 2 for collision
                Timeline broke2 = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                    startX4 += -1;
                    endX4 += -1;
                    paintLevel2();
                }));
                broke2.setCycleCount(10);
                                
                //the animation is for restart the level in the case of fail
                Timeline restart = new Timeline(new KeyFrame(Duration.millis(10), ex -> {
                	gate4.setStartY(223);
                	gate4.setEndY(237);
                    restartLevel();
                    paintLevel2();
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
        		animationCircle2.play();
        		animationCircle22.play();
                seq.play();
                fade.play();
                fade2.play();
                    	
        	}

 
        	
        });
        //------------------------------------
		

		

	}

	public void paintLevel2() {
		Rectangle rec1 = new Rectangle(0,140,118,20);
		rec1.setFill(Color.WHITE);
		Rectangle rec2 = new Rectangle(170,302,120,800);
		rec2.setFill(Color.WHITE);
		Rectangle rec3 = new Rectangle(402,200,1000,50);
		rec3.setFill(Color.WHITE);
		Rectangle rec4 = new Rectangle(0,0,500,800);
		rec4.setFill(Color.WHITE);
		
		
		getChildren().clear();	
		getChildren().add(rec4);
		paintBoldLine();
		getChildren().add(rec1);
		paintBoldLine2();
		paintBoldLine3();
		getChildren().add(rec2);
		paintBoldLine4();
		getChildren().add(rec3);
		getChildren().add(path1);
		getChildren().add(path2);
		getChildren().add(path3);
		getChildren().add(path4);
		getChildren().add(path5);
		getChildren().add(path6);
		paintCircle1();
		paintCircle2();
		paintCircle3();
		paintCircle4();
		paintGate();
		paintGate2();
		paintGate3();
		paintGate4();
		

	}

	private void paintBoldLine2() {
		Line line = new Line(startX2, startY2, endX2, endY2);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX2, startY2 - 20, 20, 20, 90, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX2, startY2 - 40, endX2, endY2 - 130);
		line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);

		Arc semiCircle2 = new Arc(startX2, startY2 - 100, 20, 20, 270, 180);
		semiCircle2.setType(ArcType.OPEN);
		semiCircle2.setFill(null);
		semiCircle2.setStrokeWidth(3);
		semiCircle2.setStroke(Color.BLACK);

		Line line3 = new Line(startX2, startY2 - 120, endX2, endY2 - 200);
		line3.setStrokeWidth(3);
		line3.setStroke(Color.BLACK);

		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
		getChildren().add(semiCircle2);
		getChildren().add(line3);
	}

	private void paintBoldLine() {
		Line Line = new Line(startX - 80, startY - 100, endX + 3, endY - 150);
		Line.setStrokeWidth(3);
		Line.setStroke(Color.BLACK);

		getChildren().add(Line);
	}

	private void paintBoldLine3() {
		Line line = new Line(startX3 + 73, startY3 - 23, endX3 + 73, endY3);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		getChildren().add(line);
	}

	private void paintBoldLine4() {
		Line line = new Line(startX4 - 7, startY4 - 20, endX4 + 50, endY4 - 70);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX4 + 72, startY4 - 20, 20, 20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX4 + 92, startY4 - 20, endX4 + 200, endY4 - 70);
		line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);

		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}


	private void paintCircle1() {
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
	
	private void paintCircle4() {
		circle4.setFill(Color.GRAY);
		getChildren().add(circle4);
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
	
	private void paintGate3() {
		gate3.setStrokeWidth(3);
		gate3.setStroke(Color.BLACK);		
		getChildren().add(gate3);		
	}

	private void paintGate4() {
		gate4.setStrokeWidth(3);
		gate4.setStroke(Color.BLACK);		
		getChildren().add(gate4);				
	}
	
	private void restartLevel() {

		startX = 200; startY = 250; endX = 200; endY = 300;
		startX2 = 200; startY2 = 250; endX2 = 200; endY2 = 300;
		startX3 = 200; startY3 = 250; endX3 = 200; endY3 = 300;
		startX4 = 200; startY4 = 250; endX4 = 200; endY4 = 300;
		path1.setOpacity(1); path2.setOpacity(1); path3.setOpacity(1); path4.setOpacity(1); path5.setOpacity(1); path6.setOpacity(1);
		circle1.setOpacity(1); circle2.setOpacity(1); circle3.setOpacity(1); circle4.setOpacity(1);
		gate1.setOpacity(1); gate2.setOpacity(1); gate3.setOpacity(1); gate4.setOpacity(1);
	    paintLevel2();
	    isPushedBoldLine1 = false; isPushedBoldLine2 = false; isPushedBoldLine3 = false; isPushedBoldLine4 = false;
	}
	
}



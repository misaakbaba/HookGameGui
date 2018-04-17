import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class Level3 extends Pane {
	private double startX = 200 , startY = 100 , endX = 400 , endY = 100 ;

	public Level3() {
		// TODO Auto-generated constructor stub
		paintLevel3();
		
		Text text = new Text(240,50,"Level 3");
		text.setFont(Font.font("Times New Roman",25));
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
	}


	public void paintLevel3() {



		getChildren().clear();
		paintBoldLine();
		paintBoldLine2();
		paintBoldLine3();
		paintPath();	
		paintPath2();
		paintPath3();
		paintCircle();
		paintCircle2();
		paintCircle3();
		paintGate();
		paintGate2();
		paintGate3();

	}

	private void paintBoldLine() {
		Line line = new Line(startX,startY,endX,endY);
        line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX + 220 ,startY,20,20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX + 240,startY,endX + 80,endY);
        line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);


		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}

	private void paintBoldLine2() {
		Line line = new Line(startX + 220,startY - 3,endX + 20,170);
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
	
	private void paintBoldLine3() {
		Line line = new Line(startX + 50 ,startY + 90,endX + 23,endY + 90);
        line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);
		
		getChildren().add(line);
	}
	
	private void paintGate() {

		Line line = new Line(247, 183, 247, 197);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);
	}
	
	private void paintGate2() {

		Line line = new Line(197, 93, 197, 107);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);
	}
	
	private void paintGate3 () {

		Line line = new Line(413, 283, 427, 283);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);
	}

	private void paintPath() {
		Line path1 = new Line(190,100,198,100);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);
		Line path2 = new Line(190,100,190,370);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);



		getChildren().add(path1);
		getChildren().add(path2);


	}

	private void paintPath2() {
		Line path1 = new Line(420,283,420,290);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);
		
		Line path2 = new Line(50,290,420,290);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);


		getChildren().add(path1);
		getChildren().add(path2);

	}
	
	private void paintPath3() {
		Line path1 = new Line(240,190,248,190);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);
		
		Line path2 = new Line(240,190,240,330);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);
		
		Line path3 = new Line(120,330,240,330);
		path3.setStrokeWidth(2);
		path3.setStroke(Color.GRAY);
		
		
		getChildren().add(path1);
		getChildren().add(path2);
		getChildren().add(path3);
	}
	

	private void paintCircle() {
		Circle circle = new Circle(30,290,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}

	private void paintCircle2() {
		Circle circle = new Circle(100,330,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}
	
	private void paintCircle3() {
		Circle circle = new Circle(190,390,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);
	}


}
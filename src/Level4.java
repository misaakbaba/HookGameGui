import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;


public class Level4 extends Pane {
	private double startX = 440 , startY = 100 , endX = 460 , endY = 100 ;
	Timeline animation;
	private Line rotatingLine = new Line(190,240,190,280);
	Circle rotatingCircle = new Circle(190,260,20);
	//daireleri global yap!

	public Level4() {
		// TODO Auto-generated constructor stub
		paintLevel4();
		
		rotatingCircle.setOnMouseClicked(e -> {
			rotateAction();
		});

	}


	public void paintLevel4() {



		getChildren().clear();
		paintBoldLine();
		paintPath();
		paintCircle();
		paintBoldLine2();
		paintPath2();
		paintCircle2();
		paintRotatingCircle();
		paintRotatingLine();
		paintGate1();
		paintGate2();

	}

	private void paintBoldLine() {
		Line hLine = new Line(startX,startY,endX,endY);
        hLine.setStrokeWidth(3);
		hLine.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX - 20 ,startY,20,20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(Color.WHITE);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX-240,startY,endX -60,endY);
		line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);


		getChildren().add(hLine);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}

	private void paintBoldLine2() {
		Line hLine = new Line(420,100,420,250);
        hLine.setStrokeWidth(3);
		hLine.setStroke(Color.BLACK);


		getChildren().add(hLine);
	}

	private void paintPath() {
		Line path1 = new Line(190,100,200,100);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);

		Line path2 = new Line(190,100,190,240);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);

		Line path3 = new Line(190,280,190,320);
		path3.setStrokeWidth(2);
		path3.setStroke(Color.GRAY);


		getChildren().add(path1);
		getChildren().add(path2);
		getChildren().add(path3);


	}

	private void paintPath2() {
		Line path1 = new Line(210,260,420,260);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);

		Line path2 = new Line(420,250,420,260);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);

		Line path3 = new Line(120,260,170,260);
		path3.setStrokeWidth(2);
		path3.setStroke(Color.GRAY);


		getChildren().add(path1);
		getChildren().add(path2);
		getChildren().add(path3);

	}

	private void paintCircle() {
		Circle circle = new Circle(190,340,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}

	private void paintCircle2() {
		Circle circle = new Circle(100,260,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}
	
	private void paintGate1() {
		Line line = new Line(413,250,427,250);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);
		
		getChildren().add(line);

	}
	
	private void paintGate2() {
		Line line = new Line(200,93,200,107);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);
		
		getChildren().add(line);

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
		if(rotatingLine.getStartX() == 190){
		rotatingLine.setStartX(170);
		rotatingLine.setEndX(210);
		rotatingLine.setStartY(260);
		rotatingLine.setEndY(260);
		}
		else {
			rotatingLine.setStartX(190);
			rotatingLine.setEndX(190);
			rotatingLine.setStartY(240);
			rotatingLine.setEndY(280);
		}

	}

	public void rotateAction() {
	    animation = new Timeline(
	    	      new KeyFrame(Duration.millis(1),e -> {
	    	    	  rotateRotatingLine();
	    	      }));
	    	    animation.setCycleCount(1);
	    	    animation.play(); // Start animation

	}
	
	public boolean isVertical() {
		
		return false;
	}
	
	


}
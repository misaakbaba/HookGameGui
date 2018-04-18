import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class level5 extends Pane {
	private double startX = 440 , startY = 100 , endX = 460 , endY = 100 ;
	Circle rotatingCircle = new Circle(190,260,20);
	Circle rotatingCircle2 = new Circle(190,260,20);
	
	
	public level5() {
		paintLevel5();
		
	}

	public void paintLevel5() {
		paintBoldLine();
		paintCircle();
		paintCircle2();
		paintCircle3();
		paintCircle4();

	}
	
	private void paintBoldLine() {
		Line line = new Line(startX,startY,endX,endY);
        line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX - 20 ,startY,20,20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(Color.WHITE);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX-240,startY,endX -60,endY);
		line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);


		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}
	
	private void paintCircle() {
		Circle circle = new Circle(190,340,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}
	
	private void paintCircle2() {
		Circle circle = new Circle(50,340,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}
	
	private void paintCircle3() {
		Circle circle = new Circle(190,340,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}
	
	private void paintCircle4() {
		Circle circle = new Circle(50,340,20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);


	}
	
	private void paintRotatingCircle() {
		rotatingCircle.setFill(Color.WHITE);
		rotatingCircle.setStroke(Color.gray(0.4));
		rotatingCircle.setStrokeWidth(3);

		getChildren().add(rotatingCircle);
	}
	
	private void paintRotatingCircle2() {
		rotatingCircle2.setFill(Color.WHITE);
		rotatingCircle2.setStroke(Color.gray(0.4));
		rotatingCircle2.setStrokeWidth(3);

		getChildren().add(rotatingCircle2);
	}

}

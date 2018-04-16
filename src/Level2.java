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
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Level2 extends Pane {
	private double startX = 200, startY = 250, endX = 200, endY = 300;

	public Level2() {
		// TODO Auto-generated constructor stub
		paintLevel2();
		
		Text text = new Text(240,50,"Level 2");
		text.setFont(Font.font("Times New Roman",25));
		getChildren().add(text);
	}

	public void paintLevel2() {

		getChildren().clear();
		paintBoldLine();
		paintBoldLine2();
		paintBoldLine3();
		paintBoldLine4();
		paintPath();
		paintPath2();
		paintPath3();
		paintPath4();
		paintCircle();
		paintCircle2();
		paintCircle3();
		paintCircle4();
		paintGate();
		paintGate2();
		paintGate3();
		paintGate4();
		

	}

	private void paintBoldLine2() {
		Line line = new Line(startX, startY, endX, endY);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX, startY - 20, 20, 20, 90, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX, startY - 40, endX, endY - 130);
		line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);

		Arc semiCircle2 = new Arc(startX, startY - 100, 20, 20, 270, 180);
		semiCircle2.setType(ArcType.OPEN);
		semiCircle2.setFill(null);
		semiCircle2.setStrokeWidth(3);
		semiCircle2.setStroke(Color.BLACK);

		Line line3 = new Line(startX, startY - 120, endX, endY - 200);
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

	private void paintBoldLine4() {
		Line line = new Line(startX + 73, startY - 23, endX + 73, endY);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		getChildren().add(line);
	}

	private void paintBoldLine3() {
		Line line = new Line(startX - 7, startY - 20, endX + 50, endY - 70);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX + 72, startY - 20, 20, 20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(null);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line line2 = new Line(startX + 92, startY - 20, endX + 200, endY - 70);
		line2.setStrokeWidth(3);
		line2.setStroke(Color.BLACK);

		getChildren().add(line);
		getChildren().add(semiCircle);
		getChildren().add(line2);
	}

	private void paintPath() {
		Line path1 = new Line(107, 150, 117, 150);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);
		Line path2 = new Line(107, 150, 107, 375);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);


		getChildren().add(path1);
		getChildren().add(path2);
	}
	
	private void paintPath2() {
		Line path1 = new Line(200, 303, 200, 375);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);


		getChildren().add(path1);
	}
	
	private void paintPath3() {
		Line path1 = new Line(273, 303, 273, 375);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);


		getChildren().add(path1);
	}
	
	private void paintPath4() {
		Line path1 = new Line(403, 230, 420, 230);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);

		Line path2 = new Line(420, 230, 420, 375);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);

		getChildren().add(path1);
		getChildren().add(path2);

	}


	private void paintCircle() {
		Circle circle = new Circle(107, 395, 20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);

	}
	
	private void paintCircle2() {
		Circle circle = new Circle(200, 395, 20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);
	}
	
	private void paintCircle3() {
		Circle circle = new Circle(273, 395, 20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);
	}
	
	private void paintCircle4() {
		Circle circle = new Circle(420, 395, 20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);
	}

	private void paintGate() {

		Line line = new Line(117, 143, 117, 157);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);
	}

	private void paintGate2() {
		
		Line line = new Line(193, 303, 207, 303);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);

	}
	
	private void paintGate3() {
		
		Line line = new Line(266, 303, 280, 303);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);
		
	}

	private void paintGate4() {
		
		Line line = new Line(403, 223, 403, 237);// this is the vertical line													// that is between
		line.setStrokeWidth(3); // the horizontal line and the path
		line.setStroke(Color.BLACK);
		
		
		getChildren().add(line);
		
		
	}
}

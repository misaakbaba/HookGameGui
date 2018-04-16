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

public class Level1 extends Pane {
	private double startX = 100, startY = 100, endX = 300, endY = 100;

	public Level1() {
		// TODO Auto-generated constructor stub
		paintLevel1();
		
		Text text = new Text(180,50,"Level 1");
		text.setFont(Font.font("Times New Roman",25));
		getChildren().add(text);
	}

	public void paintLevel1() {

		getChildren().clear();
		paintBoldLine();
		paintPath();
		paintCircle();
		paintBoldLine2();
		paintPath2();
		paintCircle2();
		paintGate();
		paintGate2();
		
		

	}

	private void paintBoldLine() {
		Line hLine = new Line(startX, startY, endX, endY);
		hLine.setStrokeWidth(3);
		hLine.setStroke(Color.BLACK);

		Arc semiCircle = new Arc(startX + 220, startY, 20, 20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(Color.WHITE);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);

		Line hLineC = new Line(startX + 240, startY, endX + 80, endY);
		hLineC.setStrokeWidth(3);
		hLineC.setStroke(Color.BLACK);

		getChildren().add(hLine);
		getChildren().add(semiCircle);
		getChildren().add(hLineC);
	}

	private void paintBoldLine2() {
		Line line = new Line(320, 97, 320, 200);
		line.setStrokeWidth(3);
		line.setStroke(Color.BLACK);

		getChildren().add(line);
	}

	private void paintPath() {
		Line path1 = new Line(90, 100, 100, 100);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);
		Line path2 = new Line(90, 100, 90, 220);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);
		Line path3 = new Line(90, 220, 400, 220);
		path3.setStrokeWidth(2);
		path3.setStroke(Color.GRAY);

		getChildren().add(path1);
		getChildren().add(path2);
		getChildren().add(path3);

	}

	private void paintPath2() {
		Line path1 = new Line(320, 200, 320, 250);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);

		getChildren().add(path1);

	}

	private void paintCircle() {
		Circle circle = new Circle(400, 220, 20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);

	}

	private void paintCircle2() {
		Circle circle = new Circle(320, 270, 20);
		circle.setFill(Color.GRAY);

		getChildren().add(circle);

	}

	private void paintGate() {

		Line VLine = new Line(100, 93, 100, 107);// this is the vertical line
													// that is between
		VLine.setStrokeWidth(3); // the horizontal line and the path
		VLine.setStroke(Color.BLACK);
		getChildren().add(VLine);
	}

	private void paintGate2() {
		Line VLine = new Line(313, 200, 327, 200);// this is the vertical line
		// that is between
		VLine.setStrokeWidth(3); // the horizontal line and the path
		VLine.setStroke(Color.BLACK);
		getChildren().add(VLine);

	}

}
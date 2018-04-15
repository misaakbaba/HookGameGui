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


public class Level2 extends Pane {
	private double startX = 100 , startY = 100 , endX = 300 , endY = 100 ;

	public Level2() {
		// TODO Auto-generated constructor stub
		paintLevel2();
	}
	

	public void paintLevel2() {
        
		
        
		getChildren().clear();
		paintBoldLine();
		paintPath();
		paintCircle();
		paintVLine();

	}
	
	private void paintBoldLine() {
		Line hLine = new Line(startX,startY,endX,endY);
        hLine.setStrokeWidth(3);
		hLine.setStroke(Color.BLACK);
		
		Arc semiCircle = new Arc(startX + 220 ,startY,20,20, 360, 180);
		semiCircle.setType(ArcType.OPEN);
		semiCircle.setFill(Color.WHITE);
		semiCircle.setStrokeWidth(3);
		semiCircle.setStroke(Color.BLACK);
		
		Line hLineC = new Line(startX + 240,startY,endX + 80,endY);
        hLineC.setStrokeWidth(3);
		hLineC.setStroke(Color.BLACK);
		

		getChildren().add(hLine);
		getChildren().add(semiCircle);
		getChildren().add(hLineC);
	}
	
	private void paintPath() {
		Line path1 = new Line(90,100,100,100);
		path1.setStrokeWidth(2);
		path1.setStroke(Color.GRAY);
		Line path2 = new Line(90,100,90,220);
		path2.setStrokeWidth(2);
		path2.setStroke(Color.GRAY);
		Line path3 = new Line(90,220,400,220);
		path3.setStrokeWidth(2);
		path3.setStroke(Color.GRAY);
		
		
		
		getChildren().add(path1);
		getChildren().add(path2);
		getChildren().add(path3);
		
	}
	private void paintCircle() {
		Circle circle = new Circle(400,220,20);
		circle.setFill(Color.GRAY);
		
		getChildren().add(circle);
		
		
	}
	
	private void paintVLine() {
		
		Line VLine = new Line(100,107,100,93);//this is the vertical line that is between
		VLine.setStrokeWidth(3);			//the horizontal line and the path 
		VLine.setStroke(Color.BLACK);
		getChildren().add(VLine);
	}

}

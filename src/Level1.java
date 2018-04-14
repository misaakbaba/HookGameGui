import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineBuilder;

public class Level1 extends Pane {
	private double startX, startY, endX, endY;

	public Level1() {
		// TODO Auto-generated constructor stub
		paintLevel1();
	}
	

	public void paintLevel1() {
        Line hLine = new Line(100,100,200,100);
        hLine.setStrokeWidth(3);
		hLine.setStroke(Color.BLACK);
        
		getChildren().clear();
		getChildren().add(hLine);
		paintPath();
		paintCircle();

	}
	
	public void paintPath() {
		Line path = new Line(200,100,220,100);
		path.setStrokeWidth(2);
		path.setStroke(Color.GRAY);
		
		
		getChildren().add(path);
		
		
	}
	public void paintCircle() {
		Circle circle = new Circle(230,100,10);
		circle.setFill(Color.GRAY);
		
		getChildren().add(circle);
		
		
	}

}

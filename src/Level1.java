
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


public class Level1 extends Pane {
	private double startX = 100, startY = 100, endX = 300, endY = 100;

	public Level1() {
		// TODO Auto-generated constructor stub
		paintLevel1();
	}
	

	public void paintLevel1() {

		getChildren().clear();
		paintPath();
		paintCircle();
		paintVLine();
		paintBoldLine();

	}
	
	private void paintBoldLine() {
        Line hLine = new Line(startX,startY,endX,endY);//horizontal line that will move
        hLine.setStrokeWidth(3);//change its width
		hLine.setStroke(Color.BLACK);
		

		getChildren().add(hLine);

	}
	
	
	private void paintPath() {
		Line path = new Line(300,100,330,100);//this is path that connects the horizontal line and
		path.setStrokeWidth(2);					//the circle that is button
		path.setStroke(Color.GRAY);
		
		
		getChildren().add(path);
		
		
	}
	private void paintCircle() {
		Circle circle = new Circle(350,100,20);//this the circle that is the button
		circle.setFill(Color.GRAY);
		
		getChildren().add(circle);
		
		
	}
	
	private void paintVLine() {
		
		Line VLine = new Line(300,107,300,93);//this is the vertical line that is between
		VLine.setStrokeWidth(3);			//the horizontal line and the path 
		VLine.setStroke(Color.BLACK);
		getChildren().add(VLine);
	}

}

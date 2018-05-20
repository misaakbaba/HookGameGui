import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Drawings extends Pane {

    void arcDrawer(Arc arc, double centerX, double centerY, double radius, double startAngle, double lenght) {
        arc = new Arc(centerX, centerY, radius, radius, startAngle, lenght);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.TRANSPARENT);
        arc.setStrokeWidth(3);
        arc.setStroke(Color.BLACK);
        getChildren().add(arc);
    }

      void linePainter(Line path, double startX, double startY, double endX, double endY, double stroke, String color) {
        path = new Line(startX, startY, endX, endY);
        path.setStrokeWidth(stroke);
        switch (color) {
            case "gray":
                path.setStroke(Color.GRAY);
                break;
            case "black":
                path.setStroke(Color.BLACK);
                break;
        }
        getChildren().add(path);

    }
    void circleDrawer(Circle circle,int centerX,int centerY,int radius,String color){
        circle = new Circle(centerX, centerY, radius);
        switch (color){
            case "GRAY":
                circle.setFill(Color.GRAY);
        }
        getChildren().add(circle);
    }
}

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Drawings extends Pane {
    private int linePst;

    public int getLinePst() {
        return linePst;
    }

    public void setLinePst(int linePst) {
        this.linePst = linePst;
    }

    void arcDrawer(Arc arc, double centerX, double centerY, double radius, double startAngle, double lenght) {
        arc = new Arc(centerX, centerY, radius, radius, startAngle, lenght);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.TRANSPARENT);
        arc.setStrokeWidth(3);
        arc.setStroke(Color.BLACK);
        getChildren().add(arc);
    }
     int disconnectorPainter(Circle circle, Line line, double centerX, double centerY, int linePst) {
        //linePst=this.linePst;
        circle = new Circle(centerX, centerY, 20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.gray(0.4));
        circle.setStrokeWidth(3);
        getChildren().add(circle);
        switch (linePst) {
            case 1:
                line = new Line(centerX, centerY - 20, centerX, centerY + 20);
                break;
            case 2:
                line = new Line(centerX - 20, centerY, centerX + 20, centerY);
                break;
        }
        line.setStrokeWidth(2);
        line.setStroke(Color.gray(0.4));
        getChildren().add(line);
    return linePst;
    }
      void pathPainter(Line path, double startX, double startY, double endX, double endY, double stroke, String color) {
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

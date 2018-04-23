import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class level5 extends Pane {
    Circle circle = new Circle(190, 260, 20);
    Circle rotatingCircle2 = new Circle(190, 260, 20);
    Line path1, path2, path3, path4, path5,path6,path7,path8,disLine, disLine2, shortPath1;
    Circle disCircle, disCircle2;
    Line boldLine1, boldLine2, boldLine3,boldLine4,boldLine5,boldLine6;
    Arc arc1, arc2,arc3;
    Line shortLine1;
    private double startX1 = 140, startY1 = 100, endX1 = 170, endY1 = 100;
    private double startX2 = 190, startY2 = 260, endX2 = 190, endY2 = 170;
    private double startX3 = 250, startY3 = 150, endX3 = 190, endY3 = 150;
    private double startX4= 300, startY4= 340, endX4= 300, endY4= 120;
    public level5() {
        paintLevel5();

    }

    public void paintLevel5() {
        //paintBoldLine();
        pathPainter(path1, 130, 400, 130, 100, 2, "gray");
        pathPainter(path2, 50, 340, 130, 340, 2, "gray");
        pathPainter(path3, 50, 260, 130, 260, 2, "black");
        pathPainter(shortPath1, 130, 100, 140, 100, 2, "gray");
        pathPainter(boldLine1, startX1, startY1, endX1, endY1, 3, "black");
        arcDrawer(arc1, endX1 + 20, endY1, 20, 360, 180);
        pathPainter(boldLine2, startX1 + 70, startY1, endX1 + 70, endY1, 3, "black");
        pathPainter(path4, 130, 260, 190, 260, 2, "gray");
        pathPainter(boldLine3, startX2, startY2, endX2, endY2, 3, "black");
        arcDrawer(arc2, endX2, endY2 - 20, 20, 270, -180);
        pathPainter(path5, endX2, endY2 - 40, endX2, endY2 - 70, 3, "black");
        disconnectorPainter(disCircle, disLine, 130, 340, 2);
        disconnectorPainter(disCircle2, disLine2, 130, 260, 1);
        pathPainter(path6,260,400,260,150,2,"gray");
        pathPainter(path7,260,150,250,150,2,"gray");
        pathPainter(boldLine4,startX3,startY3,endX3,endY3,3,"black");
        pathPainter(path8,130,340,300,340,2,"gray");
        pathPainter(boldLine5,startX4,startY4,endX4,endY4,3,"black");
        arcDrawer(arc3,endX4,endY4-20,20,270,180);
        pathPainter(boldLine6,endX4,endY4-40,endX4,endY4-60,3,"black");
        paintCircle();
        paintCircle2();
        paintCircle3();
        paintCircle4();
    }

    /* private void paintBoldLine() {
         Line line = new Line(startX, startY, endX, endY);
         line.setStrokeWidth(3);
         line.setStroke(Color.BLACK);
         Arc semiCircle = new Arc(startX - 20, startY, 20, 20, 360, 180);
         semiCircle.setType(ArcType.OPEN);
         semiCircle.setFill(Color.WHITE);
         semiCircle.setStrokeWidth(3);
         semiCircle.setStroke(Color.BLACK);
         Line line2 = new Line(startX - 240, startY, endX - 60, endY);
         line2.setStrokeWidth(3);
         line2.setStroke(Color.BLACK);
         getChildren().add(line);
         getChildren().add(semiCircle);
         getChildren().add(line2);
     }
 */
    private void paintCircle() {
        Circle circle = new Circle(260, 400, 20);
        circle.setFill(Color.PURPLE);
        getChildren().add(circle);
    }

    private void paintCircle2() {
        Circle circle = new Circle(50, 260, 20);
        circle.setFill(Color.RED);
        getChildren().add(circle);
    }

    private void paintCircle3() {
        Circle circle = new Circle(130, 400, 20);
        circle.setFill(Color.BLUE);
        getChildren().add(circle);
    }

    private void paintCircle4() {
        Circle circle = new Circle(50, 340, 20);
        circle.setFill(Color.GRAY);
        getChildren().add(circle);
    }

    private void paintRotatingCircle() {
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.gray(0.4));
        circle.setStrokeWidth(3);
        getChildren().add(circle);
    }

    private void paintRotatingCircle2() {
        rotatingCircle2.setFill(Color.WHITE);
        rotatingCircle2.setStroke(Color.gray(0.4));
        rotatingCircle2.setStrokeWidth(3);
        getChildren().add(rotatingCircle2);
    }

    private void pathPainter(Line path, double startX, double startY, double endX, double endY, double stroke, String color) {
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

    private void disconnectorPainter(Circle circle, Line line, double centerX, double centerY, int linePst) {
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
    }

    private void arcDrawer(Arc arc, double centerX, double centerY, double radius, double startAngle, double lenght) {
        arc = new Arc(centerX, centerY, radius, radius, startAngle, lenght);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStrokeWidth(3);
        arc.setStroke(Color.BLACK);
        getChildren().add(arc);
    }
}

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;


public class Level4 extends Drawings {
    double startX = 440, startY = 100, endX = 460, endY = 100;
    Timeline animation;

    /*Line hLine1,line2,hLine3;
    Line  path1,path2,path3,path4,path5,path6;
    Arc semiCircle;
    Circle circle1,circle2;
    int linePst;
    */
    Circle rotatingCircle = new Circle(190, 260, 20);
    Line rotatingLine = new Line(190, 240, 190, 280);
    //paintBoldLine
    Line hLine1 = new Line(startX, startY, endX, endY);
    Arc semiCircle = new Arc(startX - 20, startY, 20, 20, 360, 180);
    Line line2 = new Line(startX - 240, startY, endX - 60, endY);

    //paintPath
    Line path1 = new Line(190, 100, 200, 100);
    Line path2 = new Line(190, 100, 190, 240);
    Line path3 = new Line(190, 280, 190, 320);

    //paint circle
    Circle circle1 = new Circle(190, 340, 20);

    //paintBoldLine2
    Line hLine3 = new Line(420, 100, 420, 250);

    //paintPath2
    Line path4 = new Line(210, 260, 420, 260);
    Line path5 = new Line(420, 250, 420, 260);
    Line path6 = new Line(120, 260, 170, 260);

    Circle circle2=new Circle(100,260,20);

    Line gateLine = new Line(413, 250, 427, 250);
    Line gateLine2 = new Line(200, 93, 200, 107);

    public Level4() {
        paintLevel4();

        rotatingCircle.setOnMouseClicked(e -> {
            rotateAction();
        });

    }


    public void paintLevel4() {


        getChildren().clear();

        //paintBoldLine();
        pathPainter(hLine1, 3, "black");
        arcDrawer(semiCircle);
        pathPainter(line2, 3, "black");
        // paintPath();
        pathPainter(path1, 2, "gray");
        pathPainter(path2, 2, "gray");
        pathPainter(path3, 2, "gray");
        // paintCircle();
        circleDrawer(circle1, "gray");
        // paintBoldLine2();
        pathPainter(hLine3, 3, "black");

        //   paintPath2();
        pathPainter(path4, 2, "gray");
        pathPainter(path5,  2, "gray");
        pathPainter(path6, 2, "gray");

       // paintCircle2();
        circleDrawer(circle2,"gray");
        paintRotatingCircle();
        paintRotatingLine();
        //paintGate1();
        pathPainter(gateLine,3,"balck");
      //  paintGate2();
        pathPainter(gateLine2,3,"black");
    }

    private void paintBoldLine() {
        Line hLine = new Line(startX, startY, endX, endY);
        hLine.setStrokeWidth(3);
        hLine.setStroke(Color.BLACK);

        Arc semiCircle = new Arc(startX - 20, startY, 20, 20, 360, 180);
        semiCircle.setType(ArcType.OPEN);
        semiCircle.setFill(Color.TRANSPARENT);
        semiCircle.setStrokeWidth(3);
        semiCircle.setStroke(Color.BLACK);

        Line line2 = new Line(startX - 240, startY, endX - 60, endY);
        line2.setStrokeWidth(3);
        line2.setStroke(Color.BLACK);


        getChildren().add(hLine);
        getChildren().add(semiCircle);
        getChildren().add(line2);
    }

    private void paintBoldLine2() {
        Line hLine = new Line(420, 100, 420, 250);
        hLine.setStrokeWidth(3);
        hLine.setStroke(Color.BLACK);


        getChildren().add(hLine);
    }

    private void paintPath() {
        Line path1 = new Line(190, 100, 200, 100);
        path1.setStrokeWidth(2);
        path1.setStroke(Color.GRAY);

        Line path2 = new Line(190, 100, 190, 240);
        path2.setStrokeWidth(2);
        path2.setStroke(Color.GRAY);

        Line path3 = new Line(190, 280, 190, 320);
        path3.setStrokeWidth(2);
        path3.setStroke(Color.GRAY);


        getChildren().add(path1);
        getChildren().add(path2);
        getChildren().add(path3);


    }

    private void paintPath2() {

        Line path1 = new Line(210, 260, 420, 260);
        path1.setStrokeWidth(2);
        path1.setStroke(Color.GRAY);

        Line path2 = new Line(420, 250, 420, 260);
        path1.setStrokeWidth(2);
        path1.setStroke(Color.GRAY);

        Line path3 = new Line(120, 260, 170, 260);
        path3.setStrokeWidth(2);
        path3.setStroke(Color.GRAY);


        getChildren().add(path1);
        getChildren().add(path2);
        getChildren().add(path3);

    }

    private void paintCircle() {
        Circle circle = new Circle(190, 340, 20);
        circle.setFill(Color.GRAY);

        getChildren().add(circle);


    }

    private void paintCircle2() {

        Circle circle = new Circle(100, 260, 20);
        circle.setFill(Color.GRAY);

        getChildren().add(circle);


    }

   /* private void paintGate1() {

        line.setStrokeWidth(3);
        line.setStroke(Color.BLACK);

        getChildren().add(line);

    }

    private void paintGate2() {

        line.setStrokeWidth(3);
        line.setStroke(Color.BLACK);

        getChildren().add(line);

    }
*/
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
        if (rotatingLine.getStartX() == 190) {
            rotatingLine.setStartX(170);
            rotatingLine.setEndX(210);
            rotatingLine.setStartY(260);
            rotatingLine.setEndY(260);
        } else {
            rotatingLine.setStartX(190);
            rotatingLine.setEndX(190);
            rotatingLine.setStartY(240);
            rotatingLine.setEndY(280);
        }
    }

    public void rotateAction() {
        animation = new Timeline(
                new KeyFrame(Duration.millis(1), e -> {
                    rotateRotatingLine();
                }));
        animation.setCycleCount(1);
        animation.play(); // Start animation

    }

    public boolean isVertical() {

        return false;
    }


}
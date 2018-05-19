import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class level5 extends Drawings {
    Circle circle1 = new Circle(130, 400, 20), circle2 = new Circle(50, 260, 20),
            circle3 = new Circle(260, 400, 20), circle4 = new Circle(50, 340, 20);
    private double startX1 = 140, startY1 = 100, endX1 = 170, endY1 = 100;
    private double startX2 = 190, startY2 = 250, endX2 = 190, endY2 = 170;
    private double startX3 = 250, startY3 = 150, endX3 = 190, endY3 = 150;
    private double startX4 = 300, startY4 = 330, endX4 = 300, endY4 = 120;
    private Line path1 = new Line(130, 400, 130, 100), path2 = new Line(50, 340, 130, 340),
            path3 = new Line(50, 260, 130, 260),
            path4 = new Line(130, 260, 190, 260), path5, path6 = new Line(260, 400, 260, 150),
            path7 = new Line(260, 150, 250, 150), path8 = new Line(130, 340, 300, 340),
            path9 = new Line(300, 340, 300, 330), disLine = new Line(110, 340, 150, 340), disLine2 = new Line(130, 240, 130, 280),
            shortPath1 = new Line(130, 100, 140, 100), shortPath2;
    private Circle disCircle = new Circle(130, 340, 20), disCircle2 = new Circle(130, 260, 20);
    private Line boldLine1, boldLine2, boldLine3, boldLine4, boldLine5, boldLine6;
    private Arc arc1 = new Arc(endX1 + 20, endY1, 20, 20, 360, 180),
            arc2 = new Arc(endX2, endY2 - 20, 20, 20, 270, -180),
            arc3 = new Arc(endX4, endY4 - 20, 20, 20, 270, 180);
    private Line shortLine1, shortLine2, shortLine3, shortLine4;


    public level5() {
       paintLevel5();


       
    }
    void paintLevel5(){
        figure3();
        figure1();
        figure4();
        figure2();
    }

    void figure3() {
        Rectangle rectangle=new Rectangle(0,50,140,100);
        rectangle.setFill(Color.BLACK);
        getChildren().add(rectangle);
        //   circleDrawer(circle1, 130, 400, 20, "GRAY");
      //  linePainter(path1, 130, 400, 130, 100, 2, "gray");
        //linePainter(shortPath1, 130, 100, 140, 100, 2, "gray");
        getChildren().add(path1);
        getChildren().add(shortPath1);
        circle1Paint();
        linePainter(shortLine1, 140, 90, 140, 110, 3, "black");
        linePainter(boldLine1, startX1, startY1, endX1, endY1, 3, "black");
        linePainter(boldLine2, startX1 + 70, startY1, endX1 + 135, endY1, 3, "black");
        arcDrawer(arc1, endX1 + 20, endY1, 20, 360, 180);

    }


    void figure1() {
        Rectangle rectangle=new Rectangle(150,250,100,1000);
        rectangle.setFill(Color.BLACK);
        getChildren().add(rectangle);
        //  circleDrawer(circle2, 50, 260, 20, "GRAY");
        circle2Paint();
        linePainter(path3, 50, 260, 130, 260, 2, "gray");
        linePainter(path4, 130, 260, 190, 260, 2, "gray");
        //  disconnectorPainter(disCircle2, disLine2, 130, 260, 1); //bunu elle çiz
        disconnector2();
        linePainter(shortPath2, 190, 260, 190, 250, 2, "gray");
        linePainter(boldLine3, startX2, startY2, endX2, endY2, 3, "black");
        arcDrawer(arc2, endX2, endY2 - 20, 20, 270, -180);
        linePainter(path5, endX2, endY2 - 40, endX2, endY2 - 70, 3, "black");
        linePainter(shortLine2, 180, 250, 200, 250, 3, "black");

    }

    void figure4() {
        //circleDrawer(circle3, 260, 400, 20, "GRAY");
        Rectangle rectangle=new Rectangle(250,115,10000,80);
        rectangle.setFill(Color.BLACK);
        circle3Paint();
        linePainter(boldLine4, startX3, startY3, endX3, endY3, 3, "black");
        getChildren().add(rectangle);
        linePainter(path6, 260, 400, 260, 150, 2, "gray");
        linePainter(path7, 260, 150, 250, 150, 2, "gray");
        linePainter(shortLine3, 250, 140, 250, 160, 3, "black");
    }

    void figure2() {
        Rectangle rectangle=new Rectangle(280,330,70,10000);
        rectangle.setFill(Color.WHITE);
        getChildren().add(rectangle);
        linePainter(path2, 50, 340, 130, 340, 2, "gray");
        //disconnectorPainter(disCircle, disLine, 130, 340, 2);
        disconnector1();
        linePainter(path8, 130, 340, 300, 340, 2, "gray");
        linePainter(boldLine5, startX4, startY4, endX4, endY4, 3, "black");
        linePainter(path9, 300, 340, 300, 330, 2, "gray");
        arcDrawer(arc3, endX4, endY4 - 20, 20, 270, 180);
        linePainter(boldLine6, endX4, endY4 - 40, endX4, endY4 - 60, 3, "black");
        linePainter(shortLine4, 290, 330, 310, 330, 3, "black");
        // circleDrawer(circle4, 50, 340, 20, "GRAY");
        circle4Paint();
    }

    void circle4Paint() {
        circle4.setFill(Color.GRAY);
        getChildren().add(circle4);
    }

    void circle3Paint() {
        circle3.setFill(Color.GRAY);
        getChildren().add(circle3);
    }

    void circle2Paint() {
        circle2.setFill(Color.GRAY);
        getChildren().add(circle2);
    }

    void circle1Paint() {
        circle1.setFill(Color.GRAY);
        getChildren().add(circle1);
    }

    void disconnector1() {
        disCircle.setFill(Color.WHITE);
        disCircle.setStroke(Color.gray(0.4));
        disCircle.setStrokeWidth(3);
        getChildren().add(disCircle);

        disLine.setStrokeWidth(2);
        disLine.setStroke(Color.gray(0.4));
        getChildren().add(disLine);
    }

    void disconnector2() {
        disCircle2.setFill(Color.WHITE);
        disCircle2.setStroke(Color.gray(0.4));
        disCircle2.setStrokeWidth(3);
        getChildren().add(disCircle2);

        disLine2.setStrokeWidth(2);
        disLine2.setStroke(Color.gray(0.4));
        getChildren().add(disLine2);
    }
}

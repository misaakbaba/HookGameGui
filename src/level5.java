import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class level5 extends Drawings {
    /* private Line path1, path2, path3, path4, path5, path6, path7, path8, path9, disLine, disLine2, shortPath1, shortPath2;
     private Circle disCircle, disCircle2;
     private Line boldLine1, boldLine2, boldLine3, boldLine4, boldLine5, boldLine6;
     private Arc arc1, arc2, arc3;
     private Line shortLine1, shortLine2, shortLine3, shortLine4;
  */
    double startX1 = 140, startY1 = 100, endX1 = 170, endY1 = 100;
    double startX2 = 190, startY2 = 250, endX2 = 190, endY2 = 170;
    double startX3 = 250, startY3 = 150, endX3 = 190, endY3 = 150;
    double startX4 = 300, startY4 = 330, endX4 = 300, endY4 = 120;

    //figure3
    Circle circle1 = new Circle(130, 400, 20);
    Line path1 = new Line(130, 400, 130, 100);
    Line shortPath1 = new Line(130, 100, 140, 100);
    Line shortLine1 = new Line(140, 90, 140, 110);
    Line boldLine1 = new Line(startX1, startY1, endX1, endY1);
    Line boldLine2 = new Line(startX1 + 70, startY1, endX1 + 135, endY1);
    Arc arc1 = new Arc(endX1 + 20, endY1, 20, 20, 360, 180);


    //figure 1
    Circle circle2 = new Circle(50, 260, 20);
    Line path3 = new Line(50, 260, 130, 260);
    Line path4 = new Line(130, 260, 190, 260);
    Circle disCircle2 = new Circle(130, 260, 20);
    Line disLine2 = new Line(130, 240, 130, 280);
    Line shortPath2 = new Line(190, 260, 190, 250);
    Line boldLine3 = new Line(startX2, startY2, endX2, endY2);
    Arc arc2 = new Arc(endX2, endY2 - 20, 20, 20, 270, -180);
    Line path5 = new Line(endX2, endY2 - 40, endX2, endY2 - 70);
    Line shortLine2 = new Line(180, 250, 200, 250);

    //figure2
    Line path2 = new Line(50, 340, 130, 340);
    Circle disCircle = new Circle(130, 340, 20);
    Line disLine = new Line(110, 340, 150, 340);
    Line path8 = new Line(130, 340, 300, 340);
    Line boldLine5 = new Line(startX4, startY4, endX4, endY4);
    Line path9 = new Line(300, 340, 300, 330);
    Arc arc3 = new Arc(endX4, endY4 - 20, 20, 20, 270, 180);
    Line boldLine6 = new Line(endX4, endY4 - 40, endX4, endY4 - 60);
    Line shortLine4 = new Line(290, 330, 310, 330);
    Circle circle4 = new Circle(50, 340, 20);

    //figure4
    Circle circle3 = new Circle(260, 400, 20);
    Line path6 = new Line(260, 400, 260, 150);
    Line path7 = new Line(260, 150, 250, 150);
    Line boldLine4 = new Line(startX3, startY3, endX3, endY3);
    Line shortLine3 = new Line(250, 140, 250, 160);


    // Circle circle1,circle2,circle3,circle4;
    public level5() {
        figure3();
        figure1();
        figure2();
        figure4();

    }


    void figure3() {
        circleDrawer(circle1, "gray");
        pathPainter(path1, 2, "gray");
        pathPainter(shortPath1, 2, "gray");
        pathPainter(shortLine1, 3, "black");
        pathPainter(boldLine1, 3, "black");
        pathPainter(boldLine2, 3, "black");
        arcDrawer(arc1);

    }


    void figure1() {
        circleDrawer(circle2, "gray");
        pathPainter(path3, 2, "gray");
        pathPainter(path4, 2, "gray");
        //disconnectorPainter(disCircle2, disLine2, 130, 260, 1);
        pathPainter(shortPath2, 2, "gray");
        pathPainter(boldLine3, 3, "black");
        arcDrawer(arc2);
        pathPainter(path5, 3, "black");
        pathPainter(shortLine2, 3, "black");

    }

    void figure4() {
        circleDrawer(circle3, "gray");
        pathPainter(path6, 2, "gray");
        pathPainter(path7, 2, "gray");
        pathPainter(boldLine4, 3, "black");
        pathPainter(shortLine3, 3, "black");
    }

    void figure2() {
        pathPainter(path2, 2, "gray");
        //disconnectorPainter(disCircle, disLine, 130, 340, 2);
        pathPainter(path8, 2, "gray");
        pathPainter(boldLine5, 3, "black");
        pathPainter(path9, 2, "gray");
        arcDrawer(arc3);
        pathPainter(boldLine6, 3, "black");
        pathPainter(shortLine4, 3, "black");
        circleDrawer(circle4, "gray");
    }
}

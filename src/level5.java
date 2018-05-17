import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class level5 extends Drawings {
    private Line path1, path2, path3, path4, path5, path6, path7, path8, path9, disLine, disLine2, shortPath1, shortPath2;
    private Circle disCircle, disCircle2;
    private Line boldLine1, boldLine2, boldLine3, boldLine4, boldLine5, boldLine6;
    private Arc arc1, arc2, arc3;
    private Line shortLine1, shortLine2, shortLine3, shortLine4;
    private double startX1 = 140, startY1 = 100, endX1 = 170, endY1 = 100;
    private double startX2 = 190, startY2 = 250, endX2 = 190, endY2 = 170;
    private double startX3 = 250, startY3 = 150, endX3 = 190, endY3 = 150;
    private double startX4 = 300, startY4 = 330, endX4 = 300, endY4 = 120;
    Circle circle1,circle2,circle3,circle4;
    public level5() {
        figure2();
        figure1();
        figure3();
        figure4();

    }


    void figure1(){
        circleDrawer(circle1,130, 400, 20, "GRAY");
        pathPainter(path1, 130, 400, 130, 100, 2, "gray");
        pathPainter(shortPath1, 130, 100, 140, 100, 2, "gray");
        pathPainter(shortLine1, 140, 90, 140, 110, 3, "black");
        pathPainter(boldLine1, startX1, startY1, endX1, endY1, 3, "black");
        pathPainter(boldLine2, startX1 + 70, startY1, endX1 + 135, endY1, 3, "black");
        arcDrawer(arc1, endX1 + 20, endY1, 20, 360, 180);

    }


    void figure2() {
        circleDrawer(circle2,50, 260, 20, "GRAY");
        pathPainter(path3, 50, 260, 130, 260, 2, "gray");
        pathPainter(path4, 130, 260, 190, 260, 2, "gray");
        disconnectorPainter(disCircle2, disLine2, 130, 260, 1);
        pathPainter(shortPath2, 190, 260, 190, 250, 2, "gray");
        pathPainter(boldLine3, startX2, startY2, endX2, endY2, 3, "black");
        arcDrawer(arc2, endX2, endY2 - 20, 20, 270, -180);
        pathPainter(path5, endX2, endY2 - 40, endX2, endY2 - 70, 3, "black");
        pathPainter(shortLine2, 180, 250, 200, 250, 3, "black");

    }
    void figure3() {
        circleDrawer(circle3,260, 400, 20, "GRAY");
        pathPainter(path6, 260, 400, 260, 150, 2, "gray");
        pathPainter(path7, 260, 150, 250, 150, 2, "gray");
        pathPainter(boldLine4, startX3, startY3, endX3, endY3, 3, "black");
        pathPainter(shortLine3, 250, 140, 250, 160, 3, "black");
    }

    void figure4(){
        pathPainter(path2, 50, 340, 130, 340, 2, "gray");
        disconnectorPainter(disCircle, disLine, 130, 340, 2);
        pathPainter(path8, 130, 340, 300, 340, 2, "gray");
        pathPainter(boldLine5, startX4, startY4, endX4, endY4, 3, "black");
        pathPainter(path9, 300, 340, 300, 330, 2, "gray");
        arcDrawer(arc3, endX4, endY4 - 20, 20, 270, 180);
        pathPainter(boldLine6, endX4, endY4 - 40, endX4, endY4 - 60, 3, "black");
        pathPainter(shortLine4, 290, 330, 310, 330, 3, "black");
        circleDrawer(circle4,50, 340, 20, "GRAY");
    }
}

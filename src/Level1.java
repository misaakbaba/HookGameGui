import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Level1 extends Pane {
    private FadeTransition ft;
    private Text text;
    private Timeline animation, animation2;
    private Line hLine, hLineC, vLineB, path1, path2, path3, path4, hLineS, vLineS1;
    private Circle circle1, circle2;
    private Arc semiCircle;
    private double startX = 100, startY = 100, endX = 300, endY = 100;

    public Level1() {
        paintLevel1();
        circle2.setOnMouseClicked(e -> {
            doShorteningAct(vLineB, 1, 200);
        });
     /*   circle1.setOnMouseClicked(e -> {
            doShorteningAct(hLine);
        });
*/
        text = new Text(180, 50, "Level 1");
        text.setFont(Font.font("Times New Roman", 25));
        getChildren().add(text);
        text.setOpacity(0);

        animation = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            if (text.getOpacity() < 0.8)
                text.setOpacity(text.getOpacity() + 0.15);
        }));
        animation.setCycleCount(20);
        animation.play(); // Start animation
        animation2 = new Timeline(new KeyFrame(Duration.millis(100), e -> {
            text.setOpacity(text.getOpacity() - 0.05);
        }));
        animation2.setCycleCount(50);
        animation2.play(); // Start animation
    }

    public void paintLevel1() {

        getChildren().clear();
        paintBoldLine();
        paintPath();
        paintCircle();
        paintBoldLine2();
        paintPath2();
        paintCircle2();
        paintGate();
        paintGate2();

    }

    private void paintBoldLine() {
        hLine = new Line(startX, startY, endX, endY);
        hLine.setStrokeWidth(3);
        hLine.setStroke(Color.BLACK);

        semiCircle = new Arc(startX + 220, startY, 20, 20, 360, 180);
        semiCircle.setType(ArcType.OPEN);
        semiCircle.setFill(Color.WHITE);
        semiCircle.setStrokeWidth(3);
        semiCircle.setStroke(Color.BLACK);

        hLineC = new Line(startX + 240, startY, endX + 80, endY);
        hLineC.setStrokeWidth(3);
        hLineC.setStroke(Color.BLACK);
        hLine.endXProperty().bind(semiCircle.centerXProperty().add(-20));
        semiCircle.centerXProperty().bind(hLineC.startXProperty().add(-20));
        getChildren().add(hLine);
        getChildren().add(semiCircle);
        getChildren().add(hLineC);
    }

    private void paintBoldLine2() { //animation
        vLineB = new Line(320, 97, 320, 200);
        vLineB.setStrokeWidth(3);
        vLineB.setStroke(Color.BLACK);
        getChildren().add(vLineB);
    }

    private void paintPath() {
        path1 = new Line(90, 100, 100, 100);
        path1.setStrokeWidth(2);
        path1.setStroke(Color.GRAY);
        path2 = new Line(90, 100, 90, 220);
        path2.setStrokeWidth(2);
        path2.setStroke(Color.GRAY);
        path3 = new Line(90, 220, 400, 220);
        path3.setStrokeWidth(2);
        path3.setStroke(Color.GRAY);

        getChildren().add(path1);
        getChildren().add(path2);
        getChildren().add(path3);

    }

    private void paintPath2() { //fade
        path4 = new Line(320, 200, 320, 250);   //slim path
        path4.setStrokeWidth(2);
        path4.setStroke(Color.GRAY);

        getChildren().add(path4);

    }

    private void paintCircle() {
        circle1 = new Circle(400, 220, 20);
        circle1.setFill(Color.GRAY);

        getChildren().add(circle1);

    }

    private void paintCircle2() { //animation
        circle2 = new Circle(320, 270, 20);
        circle2.setFill(Color.GRAY);

        getChildren().add(circle2);


    }

    private void paintGate() {

        vLineS1 = new Line(100, 93, 100, 107);// this is the short vertical line
        // that is between
        vLineS1.setStrokeWidth(3); // the horizontal line and the path
        vLineS1.setStroke(Color.BLACK);
        getChildren().add(vLineS1);
    }

    private void paintGate2() { //animate
        hLineS = new Line(313, 200, 327, 200);// this is the short vertical line
        // that is between
        hLineS.setStrokeWidth(3); // the horizontal line and the path
        hLineS.setStroke(Color.BLACK);
        getChildren().add(hLineS);

    }

    //kısaltmanın iki çubuk için de yapılması sağlanacak
    private void doShorteningAct(Line line, int ch, int value) {
        animation = new Timeline();
        hLineS.setStartX(hLineS.getStartX() - 20);//bunlarda switch statement içine eklenecek
        hLineS.setEndX(hLineS.getEndX() + 20);
        switch (ch) {
            case 1:
                animation.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new KeyValue(line.startYProperty(), value)));
                break;
        }
        animation.setCycleCount(1);
        animation.play(); // Start animation
        ft = new FadeTransition(Duration.millis(2000), path4);

        ft.setFromValue(1.0);
        ft.setToValue(0);
        ft.setCycleCount(1);
        ft.play();
    }
}
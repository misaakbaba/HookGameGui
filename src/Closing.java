import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Closing extends Pane {

	public Closing() {

		Text cong = new Text("Congratulations");
		cong.setX(100);
		cong.setY(200);
		cong.setFont(Font.font(50));
		getChildren().add(cong);

		Image im1 = new Image("havai-fisek-hareketli-resim-0018.gif");
		ImageView gif1 = new ImageView(im1);
		getChildren().add(gif1);


		Image im3 = new Image("havai-fisek-hareketli-resim-0012.gif");
		ImageView gif3 = new ImageView(im3);
		getChildren().add(gif3);
		gif3.setX(180);
		gif3.setY(70);

		Image im4 = new Image("havai-fisek-hareketli-resim-0037.gif");
		ImageView gif4 = new ImageView(im4);
		getChildren().add(gif4);
		gif4.setX(400);

		Image im5 = new Image("havai-fisek-hareketli-resim-0043.gif");
		ImageView gif5 = new ImageView(im5);
		getChildren().add(gif5);
		gif5.setX(200);
		gif5.setY(300);







	}

}

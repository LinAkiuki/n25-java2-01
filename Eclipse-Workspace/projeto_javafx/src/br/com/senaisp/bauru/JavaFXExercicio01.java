package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXExercicio01 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Criando o nó Root
		Group noRoot = new Group();
		// Componentes do nó Root
		HBox cpm01 = new HBox();
		Rectangle cpm02 = new Rectangle(100, 100, Color.AQUA);
		Text cpm03 = new Text("Dorm 6: \n200");
		ImageView cpm04 = new ImageView();
		Button btn01 = new Button("\"Diga \\\"Olá Mundo!\\\"\"");
		Button btn02 = new Button("222");
		Button btn03 = new Button("33333");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

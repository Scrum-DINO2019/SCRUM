package application;

import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Parent root1 = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root1,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			File f = new File("res/cat.png");
			if(!f.exists()) {
				System.err.println("lol");
			}
			Image anotherIcon = new Image(new FileInputStream(f));
			primaryStage.getIcons().add(anotherIcon);
			primaryStage.setTitle("CatRecognizer ");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package application;

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
			Image anotherIcon = new Image("file:/SCRUM/src/application/cat.png");
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

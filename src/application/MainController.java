/**
 * Sample Skeleton for 'Main.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;


public class MainController {
	
	int goscie_score = 0;
	int gospodarze_score = 0;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="result"
    private TextArea result; // Value injected by FXMLLoader

    @FXML // fx:id="score"
    private TextArea score;
    
    
    @FXML
    void keyDown(KeyEvent event) {
    	System.out.println(event.getCode()+" "+event.getCharacter());
    	if(event.getCharacter().equals("w")) {
    		exit(null);
    	}else if(event.getCharacter().equals("p")) {
    		next(null);
    	}else if(event.getCharacter().equals("g")) {
    		gospodarze_point(null);
    	}else if(event.getCharacter().equals("h")) {
    		goscie_point(null);
    	}
    }
    
    @FXML
    void next(ActionEvent event) {
    	System.out.println("ee");
    	result.setText(Math.random() > 0.5 ? "Nie ma kota" : "Jest kot");
    }
    @FXML
    void exit(ActionEvent event) {
    	Platform.exit();
    	System.exit(0);
    }
    @FXML
    void gospodarze_point(ActionEvent event) {
    	//System.out.println("gg");
    	gospodarze_score++;
    	score.setText("Gospodarze " + gospodarze_score + ":" + goscie_score + " Go�cie");
    }
    @FXML
    void goscie_point(ActionEvent event) {
    	//System.out.println("hh");
    	goscie_score++;
    	score.setText("Gospodarze " + gospodarze_score + ":" + goscie_score + " Go�cie");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'Main.fxml'.";
        assert score != null : "fx:id=\"score\" was not injected: check your FXML file 'Main.fxml'.";
    
    }
}

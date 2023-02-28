


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	
		   
	@Override
	public void start(Stage stage) throws IOException {
		FXMainPane root = new FXMainPane();
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		//  set the scene to hold root
		//set stage title
		stage.setScene(new Scene(root, 500, 350));
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
	public static void main(String[] args) {
		launch(args);   
	}
}

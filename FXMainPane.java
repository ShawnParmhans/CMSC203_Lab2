/*
 Class: CMSC203 CRN 40398
 Program: Lab 2
 Instructor: Farnaz Eivazi
 Summary of Description: Use GUI with FXDriver classes
 Due Date: 07/03/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Shawn Parmhans
*/

package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {
	//student Task #2:
	//  declare five buttons, a label, and a textfield
	private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
	private Label label;
	private TextField textField;
	//  declare two HBoxes
	HBox hbox1;
	HBox hbox2;
	//student Task #4:
	//  declare an instance of DataManager
	private DataManager dataManager;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
        button2 = new Button("Howdy");
        button3 = new Button("Chinese");
        button4 = new Button("Clear");
        button5 = new Button("Exit");
        label = new Label("Feedback:");
        textField = new TextField();
		//  instantiate the HBoxes
		hbox1 = new HBox(label, textField);
		hbox2 = new HBox(button1, button2, button3, button4, button5);
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
	    hbox1.setAlignment(Pos.CENTER);
	    hbox2.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hbox1.getChildren().addAll(button1, button2, button3, button4, button5);
		//  add the buttons to the other HBox
		hbox2.getChildren().addAll(label, textField);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hbox1, hbox2);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {
	    @Override
	    public void handle(ActionEvent event) {
	        Button source = (Button) event.getSource();

	        if (source == button1) {
	            String response = dataManager.getHello();
	            textField.setText(response);
	        } else if (source == button2) {
	            String response = dataManager.getHowdy();
	            textField.setText(response);
	        } else if (source == button3) {
	            String response = dataManager.getChinese();
	            textField.setText(response);
	        } else if (source == button4) {
	            textField.setText("");
	        } else if (source == button5) {
	            Platform.exit();
	            System.exit(0);
	        }
	    }
	}
}
	

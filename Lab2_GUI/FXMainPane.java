


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
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
	//  declare two HBoxes
	private Button button1, button2, button3, button4, button5;
    private Label label;
    private TextField textField;
    private HBox hbox1, hbox2;
    
	//student Task #4:
	//  declare an instance of DataManager
    private DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	public FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		// create the buttons, label, and textfield
        button1 = new Button("Hello");
        button2 = new Button("Howdy");
        button3 = new Button("Chinese");
        button4 = new Button("Clear");
        button5 = new Button("Exit");
        label = new Label("Feedback");
        textField = new TextField();

        
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		dataManager = new DataManager();
		button1.setOnAction(new ButtonHandler());
        button2.setOnAction(new ButtonHandler());
        button3.setOnAction(new ButtonHandler());
        button4.setOnAction(new ButtonHandler());
        button5.setOnAction(new ButtonHandler());
        
    	HBox hBox = new HBox();
    	Insets inset = new Insets(10, 10, 10, 10);
    	HBox.setMargin(button1, inset);
    	HBox.setMargin(button2, inset);
    	HBox.setMargin(button3, inset);
    	HBox.setMargin(button4, inset);
    	HBox.setMargin(button5, inset);
    	HBox.setMargin(label, inset);
    	HBox.setMargin(textField, inset);
    	hBox.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
        hbox1 = new HBox();
        hbox1.getChildren().addAll(button1, button2, button3);
        hbox2 = new HBox();
        hbox2.getChildren().addAll(button4, button5, label, textField);
        getChildren().addAll(hbox1, hbox2, textField);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> 
	{
        @Override
        public void handle(ActionEvent event) {
            // get the target button that was selected
            Button button = (Button) event.getTarget();
            
            // execute the appropriate block of code based on the selected button
            if (button == button1) {
                textField.setText(dataManager.getHello());
            } else if (button == button2) {
                textField.setText(dataManager.getHowdy());
            } else if (button == button3) {
                textField.setText(dataManager.getChinese());
            } else if (button == button4) {
                textField.setText("");
            } else if (button == button5) {
                Platform.exit();
                System.exit(0);
            }
        }
    }
}
	

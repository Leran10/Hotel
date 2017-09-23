package application;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class newReservation 
{
	
	
	/*
	 * WHat we wanna do here is selective processing. 
	 * --->Check in date/ checkout date validation first 
	 * --> switch to new screen once confirmed
	 * --->display rate and select BED , ROOM TYPE, and NUMBER OF PEOPLE STAYING
	 * --> switch to new screen
	 * ---> enter guest information
	 * --->SUCCESS PROCESSED. YOUR CONFIRMATION IS ##### on  *display reservation data*
	 * -->return home button 
	 * 
	 */
	
	
	
	
	
	
	public newReservation (Stage ps)
	{
		Text t1 = new Text();
		t1.setFont(Font.font("Calibri Light",20));
		t1.setX(45); 
		t1.setY(30); 
		t1.setText("test ");
		
		Line line = new Line(); 
		line.setStartX(40); 
		line.setStartY(40); 
		line.setEndX(460); 
		line.setEndY(40);
		
		Text testText = new Text("text");
		TextField fieldTest = new TextField(); 
		
		 
		GridPane gridPane = new GridPane();    
	    // gridPane.setMinSize(500, 500); 
	    gridPane.setPadding(new Insets(10, 10, 10, 10));  
	    gridPane.setVgap(19); 
	    gridPane.setHgap(30);   
	     
	    gridPane.setLayoutX(40);
	    gridPane.setLayoutY(55);
	     
	    gridPane.setAlignment(Pos.CENTER); 
	     
	    Label space = new Label();
	    space.setText("                                           ");
	     
	    gridPane.add(testText, 0, 0); 
	    gridPane.add(space, 1, 0);      //this probably seems weird but its adding space between the left [0] and right [2] columns  
	    gridPane.add(fieldTest, 2, 0); 
	     
		
	     
	    ///////////////////////////////////////////////
	     
	     
	    Group root = new Group();
		ObservableList<Node> list = root.getChildren(); 
	
			
		list.addAll(gridPane,t1,line);       

		Scene s1 = new Scene(root,500,550);	
		ps.setScene(s1);
		ps.show();
	     
	}
}

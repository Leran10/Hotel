package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		GridPane gridpane = new GridPane();    
	    // gridPane.setMinSize(500, 500); 
		gridpane.setAlignment(Pos.CENTER); 
	    gridpane.setVgap(19); 
	    gridpane.setHgap(30);  
	    gridpane.setPadding(new Insets(25, 25, 25, 25)); 
	    
	    gridpane.setLayoutX(40);
	    gridpane.setLayoutY(55);
	      
	    
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		gridpane.add(sceneTitle,0,0,2,1);
		
		Line line = new Line(); 
		line.setStartX(40); 
		line.setStartY(40); 
		line.setEndX(460); 
		line.setEndY(40);
		
		DatePicker ci = new DatePicker();
		DatePicker co = new DatePicker();
		
		Label checkIn = new Label("Checkin date");
		gridpane.add(checkIn, 0, 1);
		gridpane.add(ci, 1, 1);

		
		Label checkOut = new Label("Checkout date");
		gridpane.add(checkOut, 0, 2);
		gridpane.add(co, 1, 2);
		
		Button btn1 = new Button("Home");
		HBox hb1 = new HBox();
		hb1.setAlignment(Pos.TOP_LEFT);
		hb1.getChildren().add(btn1);
		root.setTop(hb1);
		
		btn1.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		    
		    }
		 } );

		Button btn2 = new Button("Continue");
		HBox hb2 = new HBox();
		hb2.setAlignment(Pos.BOTTOM_RIGHT);
		hb2.getChildren().add(btn2);
		root.setBottom(hb2);
	
		btn2.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		      new chooseRoom(ps);
		    }
		 } );
		

		root.setCenter(gridpane);
	    
 
		Scene scene = new Scene(root,500,550);
		ps.setScene(scene);
	     
	}
}

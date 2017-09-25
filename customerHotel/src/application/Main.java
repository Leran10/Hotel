package application;

//Jedrik's commit. blah blah
//matt	
//test2 natt
//testmatt $
//leran
//test3 mTT
//leran	

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			DropShadow shadow = new DropShadow();
			
			Text t1 = new Text();
			t1.setFont(Font.font("Yu Gothic",30));
			t1.setX(165); 
			t1.setY(80); 
			t1.setText("Customer UI");
			
			Button b1 = new Button("New Reservation");
			b1.setPrefSize(170, 50);
			b1.setLayoutX(165);
			b1.setLayoutY(140);
			b1.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
			b1.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				            b1.setEffect(shadow);
				            //b1.setStyle(" -fx-border-color: white; -fx-body-color: white  ; ");
				            b1.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: aliceblue  ; "); 
				        }
				});
				b1.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				            b1.setEffect(null);
				            b1.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
				        }
				});
			
			b1.setOnAction(new EventHandler<ActionEvent>() 
			{
			    public void handle(ActionEvent e) 
			    {
			      new newReservation(primaryStage);
			    }
			 } );
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			
			Button b2 = new Button("View Reservation");
			b2.setPrefSize(170, 50);
			b2.setLayoutX(165);
			b2.setLayoutY(220);
			b2.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; "); 
			b2.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				            b2.setEffect(shadow);
				            b2.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: aliceblue  ; "); 
				        }
				});
				b2.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				            b2.setEffect(null);
				            b2.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; "); 
				        }
				});
			
			b2.setOnAction(new EventHandler<ActionEvent>() 
			{
			    public void handle(ActionEvent e) 
			    {
			       //next screen action
			    }
			 } );
		
			
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			
			
			Button b3 = new Button("Sign In");
			b3.setPrefSize(170, 50);
			b3.setLayoutX(165);
			b3.setLayoutY(300);
			b3.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; "); 
			b3.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	b3.setEffect(shadow);
				        	b3.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: aliceblue  ; "); 
				        }
				});
			b3.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	b3.setEffect(null);
				        	b3.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; "); 
				        }
				});
			
			b3.setOnAction(new EventHandler<ActionEvent>() 
			{
			    public void handle(ActionEvent e) 
			    {
			       //next screen action
			    }
			 } );
			
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			Button b4 = new Button("Not a member? JOIN NOW");
			b4.setPrefSize(170, 50);
			b4.setLayoutX(165);
			b4.setLayoutY(380);
			b4.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; "); 
			b4.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	b4.setEffect(shadow);
				        	b4.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: aliceblue  ; "); 
				        }
				});
			b4.addEventHandler(MouseEvent.MOUSE_EXITED, 
				    new EventHandler<MouseEvent>() {
				        @Override public void handle(MouseEvent e) {
				        	b4.setEffect(null);
				        	b4.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; "); 
				        }
				});
			
			b4.setOnAction(new EventHandler<ActionEvent>() 
			{
			    public void handle(ActionEvent e) 
			    {
			       //next screen action
			    }
			 } );
			
			
			
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			
			
			
			
			
			Group root = new Group();
			ObservableList<Node> list = root.getChildren(); 
		    list.addAll(t1,b1,b2,b3,b4);       
		 
			Scene s1 = new Scene(root,500,500);
			primaryStage.setScene(s1);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

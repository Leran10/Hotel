package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class signIn {
    
	public signIn(Stage sg){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		Text sceneTitle = new Text("Welcome Back!");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		HBox hb1 = new HBox(10);
		hb1.setAlignment(Pos.CENTER);
		hb1.getChildren().add(sceneTitle);
		root.setTop(hb1);
		
		VBox vbtn = new VBox(10);
		vbtn.setAlignment(Pos.CENTER);
			
		Button His = new Button("Make Reservation");
		His.setAlignment(Pos.CENTER);
		His.setPrefSize(170, 50);
		His.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
		
		His.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new newReservation(sg);
		    }
		 } );
		
		Button VRes = new Button("Make a Change");
		VRes.setAlignment(Pos.CENTER);
		VRes.setPrefSize(170, 50);
		VRes.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
		
		VRes.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new edRes(sg);
		    }
		 } );
		
		Button ARes = new Button("Active Reservations");
		ARes.setAlignment(Pos.CENTER);
		ARes.setPrefSize(170, 50);
		ARes.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
		
		ARes.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new acRes(sg);
		    }
		 } );
		
		Button Can = new Button("Cancellation");
		Can.setAlignment(Pos.CENTER);
		Can.setPrefSize(170, 50);
		Can.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
		
		Can.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new Cancell(sg);
		    }
		 } );
		
		
		vbtn.getChildren().add(His);
		vbtn.getChildren().add(VRes);
		vbtn.getChildren().add(ARes);
		vbtn.getChildren().add(Can);
		
		root.setCenter(vbtn);
		
		Button out = new Button("Sign Out");
		out.setAlignment(Pos.CENTER);
		out.setPrefSize(120, 30);
		out.setStyle(" -fx-border-color: darkslateblue; -fx-body-color: white  ; ");
		
		out.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new resBill(sg);
		    }
		 } );
		
		HBox hb = new HBox(10);
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().add(out);
		root.setBottom(hb);
		
		Scene scene = new Scene(root,500,500);
		sg.setScene(scene);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}

package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class viewRes {
	
	public viewRes(Stage vr){
	
	BorderPane root = new BorderPane();
	root.setPadding(new Insets(25));
	
	Button home = new Button("Home");
	root.setTop(home);
	
	Label numInput = new Label("Your Confirmation Number:");
	TextField Tinput = new TextField();
	
	GridPane gridpane = new GridPane();
	gridpane.setAlignment(Pos.CENTER);
	gridpane.setVgap(10);
	gridpane.setHgap(10);
	gridpane.setPadding(new Insets(25));
	
	gridpane.add(numInput, 0, 0);
	gridpane.add(Tinput, 0, 1);
	root.setCenter(gridpane);
	
	Button con = new Button("Continue");
	HBox hb = new HBox(10);
	hb.setAlignment(Pos.CENTER);
	hb.getChildren().add(con);
	root.setBottom(hb);
	
	con.setOnAction(new EventHandler<ActionEvent>() 
	{
	    public void handle(ActionEvent e) 
	    {
	       new success(vr);
	    }
	 } );
	
	Scene scene = new Scene(root,500,500);
	vr.setScene(scene);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

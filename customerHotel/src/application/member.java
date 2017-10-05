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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class member {
	
	public member(Stage mb){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		gridpane.setPadding(new Insets(25,25,25,25));
		
		Text sceneTitle = new Text("Sign In");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		gridpane.add(sceneTitle, 0,0,2,1);
		
		Label name = new Label("Member ID:");
		TextField Tname = new TextField();
		Label password = new Label("Password:");
		TextField Tpass = new TextField();
		
		Button home = new Button("Home");
		HBox hb = new HBox(10);
		hb.setAlignment(Pos.TOP_LEFT);
		hb.getChildren().add(home);
		root.setTop(hb);
		
		home.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       
		    }
		 } );
		
		Button btn = new Button("Submit");
		HBox hbtn = new HBox(10);
		hbtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbtn.getChildren().add(btn);
		root.setBottom(hbtn);
		
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new signIn(mb);
		    }
		 } );
		
		
		gridpane.add(name, 0, 1);
		gridpane.add(Tname, 1, 1);
		gridpane.add(password, 0, 2);
		gridpane.add(Tpass, 1, 2);
		
		root.setCenter(gridpane);
		
		Scene scene = new Scene(root,500,500);
		mb.setScene(scene);
	}

	public static void main(String[] args) {

	}

}

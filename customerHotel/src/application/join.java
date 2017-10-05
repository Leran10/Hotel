package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class join {
	
	public join(Stage jo){
		
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		gridpane.setPadding(new Insets(25,25,25,25));
		
		gridpane.setLayoutX(10);
		gridpane.setLayoutY(10);
		
		//set scene title
		Text sceneTitle = new Text("Guest Infomation");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		gridpane.add(sceneTitle,0,0,2,1);
		
		//set information form
		Label name = new Label("Username:");
		TextField Tname = new TextField();
		Label password = new Label("Password:");
		TextField Tpass = new TextField();
		Label conPass = new Label("Confirm Password:");
		TextField Tconpass = new TextField();
		Label address = new Label("address:");
		TextField Taddress = new TextField();
		Label email = new Label("Email");
		TextField Temail = new TextField();
		Label phone = new Label("phone");
		TextField Tphone = new TextField();
		
		gridpane.add(name, 0, 1);
		gridpane.add(Tname, 1, 1);
		gridpane.add(password, 0, 2);
		gridpane.add(Tpass, 1, 2);
		gridpane.add(conPass,0,3);
		gridpane.add(Tconpass, 1, 3);
		gridpane.add(address, 0, 4);
		gridpane.add(Taddress, 1, 4);
		gridpane.add(email, 0, 5);
		gridpane.add(Temail, 1, 5);
		gridpane.add(phone, 0, 6);
		gridpane.add(Tphone, 1, 6);
		
		Button btn = new Button("Join in");
		HBox hbtn = new HBox(10);
		hbtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbtn.getChildren().add(btn);
		gridpane.add(hbtn, 1, 7);
		
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new signIn(jo);
		    }
		 } );
		
		Scene scene = new Scene(gridpane,500,500);
		jo.setScene(scene);
	}

	public static void main(String[] args) {
		

	}

}

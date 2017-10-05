package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class resBill {
	
public resBill(Stage rb){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		//set scene title
		Text sceneTitle = new Text("Reservation Details");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		Label conum = new Label("Confirmation Number");
		Text Tconum = new Text("########");
		
		VBox vbx1 = new VBox(10);
		//HBox hbx2 = new HBox(10);
		HBox hbx1 = new HBox(10);
		vbx1.setAlignment(Pos.CENTER);
		//hbx2.setAlignment(Pos.CENTER);
		hbx1.setAlignment(Pos.CENTER);
		
		hbx1.getChildren().addAll(conum,Tconum);
		//hbx2.getChildren().addAll(checkin,Tin,checkout,Tout);
		vbx1.getChildren().addAll(sceneTitle,hbx1);
		root.setTop(vbx1);
		
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		gridpane.setPadding(new Insets(25,25,25,25));
		
		gridpane.setLayoutX(10);
		gridpane.setLayoutY(10);
		
	
		Label checkin = new Label("Checkin Date");
		Text Tin = new Text("########");
		Label checkout = new Label("Checkout Date");
		Text Tout = new Text("########");
		
		Label roomType = new Label("Your room type is:");
		Text type = new Text("xxxxxx");
		
		Label people = new Label("Nmber of Guests:");
		Text poNm = new Text("xx");
		
		Label fname = new Label("First Name");
		Text Tfname = new Text("xx");
		Label lname = new Label("Last Name");
		Text Tlname = new Text("xx");
		Label address = new Label("Address");
		Text Taddress = new Text("xxxxxx");
		Label email = new Label("Email");
		Text Temail = new Text("xxxxxx");
		Label phone = new Label("Phone");
		Text Tphone = new Text("xxxxxx");
		Label reward = new Label("Rewards");
		Text Treward = new Text("xxxxxx");

		
		
		gridpane.add(checkin, 0, 2);
		gridpane.add(Tin, 1, 2);
		gridpane.add(checkout, 0, 3);
		gridpane.add(Tout, 1, 3);
		gridpane.add(roomType, 0, 4);
		gridpane.add(type, 1, 4);
		gridpane.add(people, 0, 5);
		gridpane.add(poNm, 1, 5);
		gridpane.add(fname, 0, 6);
		gridpane.add(Tfname, 1, 6);
		gridpane.add(lname, 0, 7);
		gridpane.add(Tlname, 1, 7);
		gridpane.add(address, 0, 8);
		gridpane.add(Taddress, 1, 8);
		gridpane.add(email, 0, 9);
		gridpane.add(Temail, 1, 9);
		gridpane.add(phone, 0, 10);
		gridpane.add(Tphone, 1, 10);
		gridpane.add(reward, 0, 11);
		gridpane.add(Treward, 1, 11);
		
		gridpane.setAlignment(Pos.CENTER_LEFT);
		root.setCenter(gridpane);
		
//		GridPane gridpane2 = new GridPane();
//		gridpane2.setAlignment(Pos.CENTER);
//		gridpane2.setVgap(10);
//		gridpane2.setHgap(10);
//		gridpane2.setPadding(new Insets(25,25,25,25));
//		
//		gridpane2.setLayoutX(10);
//		gridpane2.setLayoutY(10);
		
		Text charge = new Text("Charges:");
		
		Label room = new Label("-Room:");
		Text Troom = new Text("$$$");
		Label water = new Label("-Water:");
		Text Twater = new Text("$$$");
		Label etc = new Label("-Etc:");
		Text Tetc = new Text("$$$");
		Text line = new Text("-----------------");
		Label total = new Label("Total:");
		Text Tto = new Text("$$$");
		
		gridpane.add(charge, 5, 2);
		gridpane.add(room, 5,3);
		gridpane.add(Troom, 6,3);
		gridpane.add(water, 5,4);
		gridpane.add(Twater, 6,4);
		gridpane.add(etc, 5,5);
		gridpane.add(Tetc, 6,5);
		gridpane.add(line, 5, 8);
		gridpane.add(total, 5,9);
		gridpane.add(Tto, 6, 9);
		
		gridpane.setAlignment(Pos.CENTER);
		root.setCenter(gridpane);
		
		Button btn = new Button("Return to Main");
		HBox hbtn = new HBox(70);
		hbtn.setAlignment(Pos.CENTER);
		hbtn.getChildren().add(btn);
       
		
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		    	
		    	
		    }
		 } );
		
		Button btn2 = new Button("Print Receipt");
		hbtn.getChildren().add(btn2);
        root.setBottom(hbtn);
        
		
		Scene scene = new Scene(root,500,500);
		rb.setScene(scene);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

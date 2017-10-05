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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class edRes {
	
	public edRes(Stage er){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		gridpane.setPadding(new Insets(25,25,25,25));
		
		gridpane.setLayoutX(10);
		gridpane.setLayoutY(10);
		
		//set scene title
		Text sceneTitle = new Text("Reservation Details");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		Label conum = new Label("Confirmation Number");
		TextField Tconum = new TextField("########");
		Tconum.setDisable(true);
		
		Label checkin = new Label("Checkin Date");
		TextField Tin = new TextField("########");
		Label checkout = new Label("Checkout Date");
		TextField Tout = new TextField("########");
		
		VBox vbx1 = new VBox(10);
		HBox hbx2 = new HBox(10);
		HBox hbx1 = new HBox(10);
		vbx1.setAlignment(Pos.CENTER);
		hbx2.setAlignment(Pos.CENTER);
		hbx1.setAlignment(Pos.CENTER);
		
		hbx1.getChildren().addAll(conum,Tconum);
		hbx2.getChildren().addAll(checkin,Tin,checkout,Tout);
		vbx1.getChildren().addAll(sceneTitle,hbx1,hbx2);
		root.setTop(vbx1);
		
		//display customer reservation number and date
		
		Label rate = new Label("Rate:");
		TextField Trate = new TextField("xxxxxx");
		Trate.setDisable(true);
		
		Label roomType = new Label("Room Type:");
		TextField type = new TextField("xxxxxx");
		
		Label people = new Label("Nmber of Guests:");
		TextField poNm = new TextField("xx");
		
		Label fname = new Label("First Name");
		TextField Tfname = new TextField("xx");
		Label lname = new Label("Last Name");
		TextField Tlname = new TextField("xx");
		Label address = new Label("Address");
		TextField Taddress = new TextField("xxxxxx");
		Label email = new Label("Email");
		TextField Temail = new TextField("xxxxxx");
		Label phone = new Label("Phone");
		TextField Tphone = new TextField("xxxxxx");
		Label reward = new Label("Rewards");
		TextField Treward = new TextField("xxxxxx");
		Treward.setDisable(true);

		
		gridpane.add(rate, 0, 4);
		gridpane.add(Trate, 1, 4);
		gridpane.add(roomType, 0, 5);
		gridpane.add(type, 1, 5);
		gridpane.add(people, 0, 6);
		gridpane.add(poNm, 1, 6);
		gridpane.add(fname, 0, 7);
		gridpane.add(Tfname, 1, 7);
		gridpane.add(lname, 0, 8);
		gridpane.add(Tlname, 1, 8);
		gridpane.add(address, 0, 9);
		gridpane.add(Taddress, 1, 9);
		gridpane.add(email, 0, 10);
		gridpane.add(Temail, 1, 10);
		gridpane.add(phone, 0, 11);
		gridpane.add(Tphone, 1, 11);
		gridpane.add(reward, 0, 12);
		gridpane.add(Treward, 1, 12);
		
		Button btn = new Button("Return to Main");
		HBox hbtn = new HBox(10);
		hbtn.setAlignment(Pos.CENTER);
		hbtn.getChildren().add(btn);
        root.setBottom(hbtn);
		
		btn.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		    	
		    }
		 } );
		
		
		root.setCenter(gridpane);
		Scene scene = new Scene(root,500,500);
		er.setScene(scene);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

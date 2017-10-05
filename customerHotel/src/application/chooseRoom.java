package application;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class chooseRoom{
	
	public chooseRoom(Stage rm){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		gridpane.setPadding(new Insets(25,25,25,25));
		
		gridpane.setLayoutX(40);
		gridpane.setLayoutY(55);
		
		
		//show checkin and checkout
		
		Label checkin = new Label("Checkin Date:");
		Text Tin = new Text("xxxxxx");
		Label checkout = new Label("Checkout Date:");
		Text Tout = new Text("xxxxxx");
		
		HBox hb = new HBox(10);
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(checkin,Tin,checkout,Tout);
		root.setTop(hb);
		
		//set room description
		Label Kingrate = new Label("Today's rate for Kingbed:");
		Label Kingprice = new Label("$xxxx");
		Label Quenerate = new Label("Today's rate for Quenebed:");
		Label Queneprice = new Label("$xxxx");
		
		gridpane.add(Kingrate,0,0);
		gridpane.add(Kingprice, 1, 0);
		gridpane.add(Quenerate, 0,1);
		gridpane.add(Queneprice, 1, 1);
		
		Label bed = new Label("Room Type:");
		final ComboBox roomType = new ComboBox();
		roomType.getItems().addAll("Single king size bed","Double quene size bed");
	    gridpane.add(bed,0,2);
	    gridpane.add(roomType, 1, 2);
	    
	    Label people = new Label("How many people:");
	    TextField Tpeople = new TextField();
	    gridpane.add(people, 0, 3);
	    gridpane.add(Tpeople, 1, 3);
	    
	    Label days = new Label("You want to stay for how many days:");
	    TextField Tdays = new TextField();
	    gridpane.add(days, 0, 4);
	    gridpane.add(Tdays, 1, 4);
	    
	    Label fname = new Label("First Name");
		TextField Tfname = new TextField();
		Label lname = new Label("Last Name");
		TextField Tlname = new TextField();
		Label address = new Label("Address");
		TextField Taddress = new TextField();
		Label email = new Label("Email");
		TextField Temail = new TextField();
		Label phone = new Label("phone");
		TextField Tphone = new TextField();
		Label reward = new Label("Rewards");
		TextField Treward = new TextField();
		
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
		
		
	    
	    Button btn1 = new Button("Cancell");
	    
	    btn1.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		      new success(rm);
		    }
		 } );
	    
	    Button btn2 = new Button("Submit");
	     
	    btn2.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		      new success(rm);
		    }
		 } );
	    
	    HBox hbx = new HBox(10);
	    hbx.setAlignment(Pos.CENTER);
	    hbx.getChildren().addAll(btn1,btn2);
		root.setBottom(hbx);
	    
		root.setCenter(gridpane);	    
	    Scene scene = new Scene(root,500,500);
		rm.setScene(scene);
	}

	public static void main(String[] args) {
		

	}

}

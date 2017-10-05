package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class viewHis {
	
	public viewHis(Stage vh){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		Text tres = new Text("Previous Stays");
		tres.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		Button home = new Button("Home");
		VBox vb = new VBox(10);
		vb.setAlignment(Pos.TOP_LEFT);
		vb.getChildren().addAll(home,tres);
		root.setTop(vb);
		
		GridPane gridpane = new GridPane();
		root.setCenter(gridpane);
		
		Text change = new Text("Select a Reservation to View Statement");
		change.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		Button con = new Button("Continue");
		VBox vb1 = new VBox(10);
		vb1.setAlignment(Pos.BASELINE_RIGHT);
		vb1.getChildren().addAll(change,con);
		root.setBottom(vb1);
		
		con.setOnAction(new EventHandler<ActionEvent>() 
		{
		    public void handle(ActionEvent e) 
		    {
		       new resBill(vh);
		    }
		 } );
		
		Scene scene = new Scene(root,500,500);
		vh.setScene(scene);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

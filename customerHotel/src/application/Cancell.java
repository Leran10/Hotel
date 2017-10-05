package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Cancell {
	
public Cancell(Stage ca){
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));
		
		Text tres = new Text("Current Reservations");
		tres.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		Button home = new Button("Home");
		VBox vb = new VBox(10);
		vb.setAlignment(Pos.TOP_LEFT);
		vb.getChildren().addAll(home,tres);
		root.setTop(vb);
		
		GridPane gridpane = new GridPane();
		root.setCenter(gridpane);
		
		Text change = new Text("Select a Reservation to Cancell");
		change.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		Button con = new Button("Continue");
		VBox vb1 = new VBox(10);
		vb1.setAlignment(Pos.BASELINE_RIGHT);
		vb1.getChildren().addAll(change,con);
		root.setBottom(vb1);
		
		Scene scene = new Scene(root,500,500);
		ca.setScene(scene);
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

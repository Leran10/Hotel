
/*
 * author: Rithy Vincent Heng
 * 
 * rvh: A prototype client class that connects to a server
 * class. In this current state, is only reads the names stored
 * in the database
 */

package com.hms;

import java.io.*;
import java.net.*;
import java.util.*;
import javafx.application.Application;
import javafx.application.Platform;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {

    ObjectOutputStream oos;
    ObjectInputStream ois;
    
    ArrayList<Customer> customersFromDatabase;

    private TextArea ta = new TextArea();
    private Button btSubmit = new Button("Get Customers From Database");
    
    @Override
    public void start(Stage primaryStage) {
	
	// rvh: This sets the UI (which is pretty basic...and ugly)
	ta.setWrapText(true);
	GridPane gridPane = new GridPane();
	gridPane.add(btSubmit, 0, 0);
	BorderPane pane = new BorderPane();
	pane.setTop(gridPane);
	pane.setCenter(new ScrollPane(ta));
	Scene scene = new Scene(pane, 500, 500);
	primaryStage.setTitle("Hotel Management System Client");
	primaryStage.setScene(scene);
	primaryStage.show();
	btSubmit.setOnAction(e -> connectToServer());

    }

    // rvh: This method gets called when the submit button is pressed. It connects to the server
    public void connectToServer() {
	try {
	    // rvh: Basic socket server code. For now, both the clients and
	    // the server will live locally but that will change    
	    Socket connectToServer = new Socket("localhost", 8000);
	    oos = new ObjectOutputStream(connectToServer.getOutputStream());
	    ois = new ObjectInputStream(connectToServer.getInputStream());
	    
	    // rvh: Tell the server you want a list of customers
	    // I didn't use the writeBoolean method because our
	    // server expects an object, so perform a cast here.
	    oos.writeObject((boolean) true);
	    oos.flush(); // rvh: flush any bytes left in the buffer
	    
	    customersFromDatabase = new ArrayList<Customer>();
	    
	    // Listen for the Server's response
	    while (true) {
		Object objectIn = ois.readObject();
		if (objectIn.toString().contains("end")) {
		    break;
		}
		Customer c = (Customer) objectIn;
		customersFromDatabase.add(c);

	    }

	} catch (Exception ex) {
	    // TODO Handle exception
	}
	try {
	    // rvh: If we got a response from the server and the data isn't corrupted,
	    // display the names
	    if (customersFromDatabase == null) {
		return;
	    }
	    Platform.runLater(() -> {
		ta.appendText(" ...Received from Database. Table - Names: \n");
	    });
	    for (Customer item : customersFromDatabase) {
		ta.appendText(item.getName() + '\n');
	    }
	} catch (Exception ex) {

	}

    }

    public static void main(String[] args) {
	launch(args);
    }
}

/*
 * author: Rithy Vincent Heng
 * 
 * rvh: This is a really crappy implementation of a server but hey,
 * it's a start! In this current state, it connects to a database
 * (amazon webservice RDS in our case) through credentials and 
 * stores the customer info, then listens for clients
 */

package com.hms;

import java.io.*;
import java.net.*;
import java.util.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Server extends Application {
    
    // rvh: Declare and Initialize some general UI stuff
    private TextField dbHost, dbPort, dbUser, dbPass, dbName;
    private TextField[] databaseInfo = new TextField[] { 
	    dbHost = new TextField(), 
	    dbPort = new TextField(),
	    dbUser = new TextField(), 
	    dbPass = new TextField(), 
	    dbName = new TextField() };

    private Label[] databaseLabels = new Label[] { 
	    new Label("Host"), 
	    new Label("Port"), 
	    new Label("User"),
	    new Label("Pass"), 
	    new Label("Database") };

    private Button btSubmit = new Button("Get Database");
    private boolean gotDataBase = false;
    private ArrayList<Customer> customerList;
    private TextArea ta = new TextArea();

    @Override 
    public void start(Stage primaryStage) {
	
	ta.setWrapText(true);
	GridPane gridPane = new GridPane();
	int rowLength = databaseInfo.length;
	for (int i = 0; i < rowLength; i++) {
	    gridPane.add(databaseLabels[i], 0, i);
	    gridPane.add(databaseInfo[i], 1, i);
	    databaseInfo[i].setAlignment(Pos.BASELINE_RIGHT);
	}
	gridPane.add(btSubmit, 1, rowLength + 1);
	BorderPane pane = new BorderPane();
	pane.setCenter(new ScrollPane(ta));
	pane.setTop(gridPane);
	Scene scene = new Scene(pane, 500, 500);
	primaryStage.setTitle("Server");
	primaryStage.setScene(scene);
	primaryStage.show();
	btSubmit.setOnAction(e -> connectToDatabase());

    }

 // rvh: This method gets called when the submit button is pressed. It connects to the db
    public void connectToDatabase() {
	try {
	    // rvh: grab the credentials from the text fields in the UI
	    // If the credentials suck or you enter something invalid
	    // you won't connect
	    String[] parameters = new String[5];
	    for (int i = 0; i < 5; i++) {
		try {
		    parameters[i] = databaseInfo[i].getText();
		} catch (Exception ex) {
		    System.out.println(ex);

		}
	    }

	     RDSDatabaseConnection dbConnection = new RDSDatabaseConnection(parameters[0],
	     parameters[1],
	     parameters[2],
	     parameters[3],
	     parameters[4]);


	    customerList = dbConnection.getCustomerList();
	    gotDataBase = true;

	} catch (Exception ex) {
	    System.out.println(ex);
	} finally {
	    if (gotDataBase) {
		// rvh: If you got through the database, the server can open a new thread to 
		// start listening for clients
		new Thread(() -> connectToClient()).start();
	    }
	}
    }

 // rvh: This method gets called if connection to the database was successful
    public void connectToClient() {
	try {
	    // rvh: These basic socket codes should look familiar by now...
	    ServerSocket serverSocket = new ServerSocket(8000);
	    ta.appendText("Server started on " + new Date() + "\nListening for clients...\n");
	    Socket connectToClient = serverSocket.accept();

	    // rvh: This is a threaded task. It says when you have the cpu after other threads are done, call this
	    Platform.runLater(() -> {
		ta.appendText("Connected to a client " + " on " + new Date() + '\n');
	    });

	    ObjectInputStream clientInputStream = new ObjectInputStream(connectToClient.getInputStream());
	    ObjectOutputStream clientOutputStream = new ObjectOutputStream(connectToClient.getOutputStream());

	    // rvh: Continuously serve the client
	    while (true) {
		Boolean start = false;
		start = (Boolean) clientInputStream.readObject();
		if (start) {
		    // rvh: Send results back to the client
		    int len = customerList.size();
		    for (int i = 0; i < len; i++) {
			Customer c = customerList.get(i);
			clientOutputStream.writeObject(c);
		    }
		    clientOutputStream.writeObject((String) "end");
		    clientOutputStream.flush();

		}

		Platform.runLater(() -> {
		    ta.appendText("Info Sent...");
		});
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    public static void main(String[] args) {
	launch(args);
    }
}

/*
 * author: Rithy Vincent Heng
 * 
 * For this to work, make sure you have a JDBC (java database connection) 
 * Library in your project build.
 * It connects to an amazon RDS, queries the customer table, and then only (for now) 
 * stores the customer name. 
 */


package com.hms;

import java.sql.*;
import java.util.*;

public class RDSDatabaseConnection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL_PREFACE = "jdbc:mysql://";

    String hostname = null;
    String port = null;
    String user = null;
    String pass = null;
    String database = null;
    
    // rvh: The array of customer objects that gets passed to the server
    ArrayList<Customer>  ret = null;
    public ArrayList<Customer> getCustomerList() {
	  return this.ret;
    }

    // rvh: This method, as the name implies, connects to the Database
    private void ConnectToDatabase() {
	
	Connection conn = null;
	Statement stmt = null;
	
	try {
	    
	    Class.forName(JDBC_DRIVER);
	    System.out.print("Connecting to " + hostname + "...");

	    conn = DriverManager.getConnection(DB_URL_PREFACE + hostname + ":" + port + "/" + database, user, pass);
	    System.out.println("SUCCESS");


	    System.out.println("Getting data from table...");
	    stmt = conn.createStatement();

	    String sql = "SELECT * FROM hmsdb.customers";

	    ResultSet results = stmt.executeQuery(sql);
	    System.out.println("SUCCESS");
	    
	    String name = "";
	    ret = new ArrayList<Customer>();

	    while (results.next()) {
		name = results.getString("firstname");
		ret.add(new Customer(name));
	    }
	    
		    
	    System.out.println("End of Data from table");

	} catch (SQLException se) {
	    System.out.println("A SQL error has occurred:");
	    se.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    // Once everything has finished running, even when errors are caught, we should
	    // make sure the JDBC connection is closed.
	    try {
		if (stmt != null)
		    conn.close();
	    } catch (SQLException se) {
	    }
	    try {
		if (conn != null) {
		    conn.close();
		    System.out.println("Connection to database is closed.");
		}

	    } catch (SQLException se) {
		se.printStackTrace();
	    }
	}

    }

    public RDSDatabaseConnection(String hostname, String port, String user, String pass, String database) {
	try {
	    this.hostname = hostname;
	    this.port = port;
	    this.user = user;
	    this.pass = pass;
	    this.database = database;
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("Not enough arguments provided. Be sure to input as indicated:");
	    System.out.println("<host> <port> <username> <password> <database>");
	}
	
	try {
	    this.ConnectToDatabase();
	    
	} catch(Exception ex) {
	    ex.printStackTrace();
	}
	
	
    }

}

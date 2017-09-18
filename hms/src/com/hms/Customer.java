/*
 * author: Rithy Vincent Heng
 * 
 * A really basic class for testing purposes...
 */

package com.hms;

//Implements Seriablizable to support object IO  
public class Customer implements java.io.Serializable {
    private String name;

    public Customer() {
	this.name = "";
    }
    
    public Customer(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}

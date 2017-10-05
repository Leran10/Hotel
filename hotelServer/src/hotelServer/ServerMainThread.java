package hotelServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServerMainThread implements Runnable
{
	Socket clientSocket = null;
	boolean threadLife = true;
	ObjectInputStream in;
	ObjectOutputStream out;

	
	public ServerMainThread(Socket cSocket)
	{
		this.clientSocket = cSocket;
		try {
			
			in =  new ObjectInputStream(clientSocket.getInputStream());
			out = new ObjectOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	public void run() 
	{
			while(threadLife == true)
			{
				Object name;
				ArrayList<String> loginCredentials = new ArrayList<String>();
				try {
					name = in.readObject();
					//System.out.println(name);
					loginCredentials =  (ArrayList<String>) name;
					System.out.println(loginCredentials.get(0));
					System.out.println(loginCredentials.get(1));
					
					
				} catch (ClassNotFoundException | IOException e) {
					System.out.println("Disconnecting thread..");
					try {
						in.close();
						out.close();
						clientSocket.close();
						threadLife = false;
						break;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				dbConnector db = new dbConnector();
				db.connect();
				
				
				String query = "SELECT userName, password FROM hmsdb.employeeLogin where userName = '" +
						loginCredentials.get(0) +"' AND password = '" + loginCredentials.get(1) +"'";
				ResultSet rs;
				String uName = "check";
				try {
					rs = db.stmt.executeQuery(query);
					while (rs.next())
					{
						uName = rs.getString("userName");
					}
					if(uName.contentEquals(loginCredentials.get(0))){
						
						Object response = "pass";
						out.writeObject(response);	
						functions();
					}else{
						System.out.println("failed");
						Object response ="fail";
						out.writeObject(response);
					}
						
					
				} catch (SQLException | IOException e) {
					
					//TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("ERROR WITH DATABASE");
					System.out.println("Disconnecting thread..");
					try {
						in.close();
						out.close();
						clientSocket.close();
						threadLife = false;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}	
	}
	
	public void functions()
	{
		while(threadLife == true)
		{
			Object choice;
			try {
				choice = in.readObject();
				String selection = (String) choice;
				
				System.out.println("you chose " + selection);  ////////////////// delete////////////////////////
				
				switch (selection)
				{
				
				//cases for employee reservation menu
				case "newReservation":
					
					break;
				
				case "editReservation":
					
					break;
				
				case "checkInRes":
					
					break;
					
				case "checkOutRes":
					
					break;
				
				//more case will be added
				
				default:
					System.out.println("invalid switch clause");
				
				}
				
				
				
				
				
				
				
				
				
				
				
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Disconnecting thread..");
				try {
					in.close();
					out.close();
					clientSocket.close();
					threadLife = false;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
			
		}
	}
		
	
	
}

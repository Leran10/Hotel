package hotelServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server 
{

	public static void main(String[] args) 
	{
		ServerSocket ss;
		try 
		{
			ss = new ServerSocket(8080);
			System.out.println("Server is running on port 8080");
			
			while(true)
			{
				Socket clientSocket = ss.accept();
				System.out.println("Client Connected");  
				new Thread(new ServerMainThread(clientSocket)).start(); // 
				
			}
		} catch (IOException e) 
		{

			System.out.println("Error generating server..");
			e.printStackTrace();
			
		}
		
		

	}

}

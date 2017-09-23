package hotelServer;

import java.net.Socket;

public class ServerMainThread implements Runnable
{
	Socket clientSocket = null;
	boolean threadLife = true;
	public ServerMainThread(Socket cSocket)
	{
		this.clientSocket = cSocket;
	}
	
	
	public void run() 
	{
			while(threadLife == true)
			{
			
					
				
				//mm : retrieve command  from client for what to do
				
				
				
				// mm : this if will be necessary for trycatch validation later keep**
				if(threadLife == true)
				{
				//mm: response to  method to determine next action
				}
			}
	}
		
	
	
}

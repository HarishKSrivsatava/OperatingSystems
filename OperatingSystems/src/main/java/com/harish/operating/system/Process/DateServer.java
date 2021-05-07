package com.harish.operating.system.Process;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.util.Date;


public class DateServer {

	public static void main(String[] args)  {
		try{
		// Create a server socket listening at 6013(random)
		ServerSocket serverSocket = new ServerSocket(6013);
		// Now listen for connection
		while(true){
			Socket client = serverSocket.accept();
			PrintWriter printWriter = new PrintWriter(client.getOutputStream(),true);
			// Write the Data to the socket
			printWriter.println(new Date().toString());
			// Close the socket and resume listening for connections
			client.close();
		}
		}catch(IOException exe){
			System.err.println(exe);
		}
	}
}

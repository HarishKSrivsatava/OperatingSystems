package com.harish.operating.system.Process;


import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DateClient {

	public static void main(String[] args) {
		try{
			// Make a connection with Server Socket
			Socket socket = new Socket("127.0.0.1", 6013);
			// Get InputStream for the socket connection
			InputStream inputStream = socket.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(inputStream));
			// Read the date from the Server
			String line;
			while((line = bin.readLine()) != null){
				System.out.println(line);
			}
			// close the socket connection
			socket.close();
		}catch(IOException exe){
			System.err.println(exe);
		}
	}
}

import java.io.*;
import java.net.*;

public class Server {
	public static void main (String args[]){
try{
		ServerSocket serverSocket = new ServerSocket(5000);
		System.out.println("Server waiting for a client....");
		Socket socket = serverSocket.accept();
		System.out.println("Server connected with client !");
		OutputStream output = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(output, true);
		for(int i=1;i<=5;i++){
			StringBuilder row = new StringBuilder();
			for(int j=1;j<=i;j++){
				row.append("* ");
			}
				writer.println(row.toString());
		}
		writer.println("END");
		socket.close();
		serverSocket.close();
		System.out.println("Message send!");
	}
	
		catch(IOException e){
		e.printStackTrace();
	}
}
}
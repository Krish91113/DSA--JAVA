import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Send a star pattern
            int n = 5;
            for (int i = 1; i <= n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 1; j <= i; j++) {
                    row.append("* ");
                }
                writer.println(row.toString());
            }

            writer.println("END"); // to indicate end of message
            socket.close();
            serverSocket.close();
            System.out.println("Pattern sent to client. Server closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

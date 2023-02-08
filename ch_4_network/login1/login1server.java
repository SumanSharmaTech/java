import java.io.*;
import java.net.*;

public class login1server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server started, waiting for clients...");
        while (true) {
            Socket socket = server.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            String[] credentials = reader.readLine().split(" ");
            String userId = credentials[0];
            String password = credentials[1];
            if (userId.equals("sa") && password.equals("Bhesh")) {
                writer.println("you are welcome");
            } else {
                writer.println("access denied");
            }
        }
    }
}

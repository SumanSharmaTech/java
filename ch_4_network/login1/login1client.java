import java.io.*;
import java.net.*;
import java.util.Scanner;

public class login1client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer.println(userId + " " + password);
        System.out.println(reader.readLine());
    }
}

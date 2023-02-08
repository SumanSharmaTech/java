import java.net.*;
import java.io.*;

public class PalindromeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1500);
        while (true) {
            System.out.println("Listening on port 1500");

            Socket cs = ss.accept();
            DataInputStream ds = new DataInputStream(cs.getInputStream());
            String str = ds.readLine();
            Boolean res = str.equals(new StringBuilder(str).reverse().toString());
            PrintStream ps = new PrintStream(cs.getOutputStream());
            if (res) {
                String result = "palindrome";
                ps.println(result);
            } else {
                String result = "not palindrome";
                ps.println(result);
            }
            ds.close();
            cs.close();
        }
    }
}
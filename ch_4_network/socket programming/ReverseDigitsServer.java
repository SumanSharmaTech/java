import java.net.*;
import java.io.*;

public class ReverseDigitsServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1500);
        while (true) {
            System.out.println("Listening on port 1500");
            Socket cs = ss.accept();
            DataInputStream ds = new DataInputStream(cs.getInputStream());
            int num = Integer.parseInt(ds.readLine());
            // int number = Integer.parseInt(num);
            int reverse = 0;
            do {
                int ext = num % 10;
                reverse = reverse * 10 + ext ;
                num /= 10;
            } while (num != 0);
            PrintStream ps = new PrintStream(cs.getOutputStream());
            ps.println(reverse);

            ds.close();
            cs.close();
        }
    }
}

import java.net.*;
import java.util.*;
import java.io.*;

public class ReverseDigit {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("localhost", 1500);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        PrintStream ps = new PrintStream(cs.getOutputStream());
        ps.println(num);
        DataInputStream ds = new DataInputStream(cs.getInputStream());
        int reverse = Integer.parseInt(ds.readLine());
        System.out.println("The Reverse of " + num + " is " + reverse);
        ds.close();
        cs.close();
        sc.close();
    }
}

import java.net.*;
import java.util.*;
import java.io.*;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("localhost", 1500);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        PrintStream ps = new PrintStream(cs.getOutputStream());
        ps.println(str);
        DataInputStream ds = new DataInputStream(cs.getInputStream());
        String result = ds.readLine();
        System.out.println("The String is " + result);
        ds.close();
        cs.close();
        sc.close();
    }
}
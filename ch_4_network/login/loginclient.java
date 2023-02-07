import java.net.*;
import java.io.*;
import java.util.Scanner;
public class loginclient{
    public static void main(String [] args) throws Exception{
        Socket cs=new Socket("localhost", 1234);
        String lid;
        String lid1,pwd;
        String s,s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the login id");
        lid=sc.nextLine();
        System.out.println("Enter your password");
        pwd=sc.nextLine();

        PrintStream out=new PrintStream(cs.getOutputStream());
        out. println(lid);
        out.println(pwd);

        // DataInputStream in=new DataInputStream(cs.getInputStream());
        // s=in.readLine();
        // s1=in.readLine();
        // s2=in.readLine();

        BufferedReader in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
        s=in.readLine();
        s1=in.readLine();
        s2=in.readLine();

        System.out. println(s);
        System.out. println(s1);
        System.out.println(s2);
        out.close();
        in.close();
        cs.close();
    }
}

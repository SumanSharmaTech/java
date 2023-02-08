import java.net.*;
import java.io.*;
public class loginserver{
    public static void main(String [] args) throws Exception{
        ServerSocket ss=new ServerSocket(1010);
        String pwd,lid;
        while(true){
            Socket cs=ss.accept();
            // DataInputStream in=new DataInputStream(cs.getInputStream());
            // lid=in.readLine();
            // pwd=in.readLine();
            BufferedReader in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
            lid=in.readLine();
            pwd=in.readLine();
            PrintStream out=new PrintStream(cs.getOutputStream());
            if(lid.equals(" sa")&& pwd .equals(" Bhesh")){
                out.println("You are welcome");
            }
            else{
                out.println("Access denied");
            }
            out.close();
            in.close();
            ss.close();
        }
    }
}

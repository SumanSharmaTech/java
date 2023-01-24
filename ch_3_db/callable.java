// JAVA program to insert and display the records using the CallableStatement.

import java.sql. *;
import java.util. *;
public class callable
{
public callable()
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter id ");
int id=sc.nextlnt();
sc .nextLine();//flushing
System.out.println("Enter name");
String nm=sc.nextLine();
System.out.println("Enter address");
String add=sc.nextLine();
System.out.println("Enter phone number");
String pn=sc.nextLine();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String url = "jdbc:odbc:Bhesh";
Connection conn= DriverManager.getConnection(url,"","");
CallableStatement cs= "conn .prepareCall(" { call proc_insert(?.?.?.?)} ");
cs.setlnt(l,id);
cs.setString(2,nm);
cs.setString(3,add);
cs.setString(4,pn);
cs.execute();
System.out.println("Record Inserted Successfully");
CallableStatement cs1 =conn.prepareCall(" { call proc_display} ");
ResultSet rs=cs1.executeQuery();
while(rs .next())
{
int i=rs.getlnt(1);
String nam=rs.getString(2);
String addr=rs.getString(3);
String phn=rs.getString( 4);
System.out.println(i+" " + nam+" "+ addr + " " +phn);
}}
catch(Exception e)
{
System.out.println("Error occured"+e.getMessage());
    return }
}
public static void main(String [] args)
{
new callable();
}}
import java.util.*;
class Pcheck{
    private String str;
    public void setData(String str){
        this.str = str;
    }
    public void displayResult(){
        String rev = "";
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string is Pallendrome");
        }
        else{
            System.out.println("The string is Not Pallendrome");
        }
    }
}
class Pallendrome {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pcheck p = new Pcheck();
        p.setData(str);
        p.displayResult();
    }
}

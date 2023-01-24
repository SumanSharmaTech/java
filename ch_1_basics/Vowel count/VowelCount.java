import java.util.*;
class count{
    private String str;
    public void setData(String str){
        this.str = str;
    }
    public void countVol(){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
class VowelCount{
    public static void main(String[] args){
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count c = new count();
        c.setData(str);
        c.countVol();
        
    }
}
import java.math.*;
class Rootclass{
    double a, b, c, d, r1, r2;
    public void getValues(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getRoots(){
        d = Math.pow(b,2) - 4*a*c;
        System.out.println("Roots are " + r1 + " and " + r2);
    }
    public void displayRoots(){
        if(d > 0){
            r1 = (-b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Roots are " + r1 + " and " + r2);
        }
        else if(d == 0){
            r1 = r2 = -b/(2*a);
            System.out.println("Roots are " + r1 + " and " + r2);
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}

class Roots{
    public static void main(String[] args){
        double a, b, c, d, r1, r2;
        Rootclass r = new Rootclass();
        r.getValues(1, 2, 3);
        r.displayRoots();
    }
}
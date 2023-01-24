public class realroots {
    private double a, b, c;
    public void setData(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void displayResult(){
        double d = b*b - 4*a*c;
        if(d > 0){
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("The roots are real and distinct");
            System.out.println("The roots are: " + r1 + " and " + r2);
        }
        else if(d == 0){
            double r1 = -b/(2*a);
            System.out.println("The roots are real and equal");
            System.out.println("The roots are: " + r1 + " and " + r1);
        }
        else{
            System.out.println("The roots are imaginary");
        }
    }
    
}

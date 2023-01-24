// method overloading in java 
class A
{
    void showA()
    {
        System.out.println("showA() of A");
    }
    void showA(int a)
    {
        System.out.println("showA(int a) of A");
    }
}
class B extends A
{
    void showB()
    {
        System.out.println("showB() of B");
    }
    void showB(int b)
    {
        System.out.println("showB(int b) of B");
    }
}
class methodoverloading
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.showA();
        obj.showA(10);
        obj.showB();
        obj.showB(20);
    }
}
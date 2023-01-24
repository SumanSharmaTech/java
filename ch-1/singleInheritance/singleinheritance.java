// single inheritance in java
class A
{
    int a;
    void showA()
    {
        System.out.println("a = " + a);
    }
}
class B extends A
{
    int b;
    void showB()
    {
        System.out.println("b = " + b);
    }
}

class singleinheritance
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.a = 10;
        obj.b = 20;
        obj.showA();
        obj.showB();
    }
}
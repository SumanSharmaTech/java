// static data member and static member function in java
class A
{
    static int a;
    static void showA()
    {
        System.out.println("a = " + a);
    }
}

class B extends A
{
    static int b;
    static void showB()
    {
        System.out.println("b = " + b);
    }
}

class staticmembers
{
    public static void main(String args[])
    {
        B.a = 10;
        B.b = 20;
        B.showA();
        B.showB();
    }
}
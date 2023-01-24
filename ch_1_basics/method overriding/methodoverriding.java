// method overriding in java
class A
{
    void showA()
    {
        System.out.println("showA() of A");
    }
}
class B extends A
{
    void showA()
    {
        System.out.println("showA() of B");
    }
}
class methodoverriding
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.showA();
    }
}
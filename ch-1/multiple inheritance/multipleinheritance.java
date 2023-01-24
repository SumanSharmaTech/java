//multiple inheritance in java
interface A
{
    int a = 10;
    void showA();
}
interface B
{
    int b = 20;
    void showB();
}
class C implements A, B
{
    public void showA()
    {
        System.out.println("a = " + a);
    }
    public void showB()
    {
        System.out.println("b = " + b);
    }
}
class multipleinheritance
{
    public static void main(String args[])
    {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
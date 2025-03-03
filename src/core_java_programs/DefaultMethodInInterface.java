package core_java_programs;

interface demo1
{
    default void m1()
    {
        System.out.println("m1 method demo 1");
    }
    default void m3()
    {
        System.out.println("m3 method of demo 1");
    }
}
interface demo2
{
    default void m2()
    {
        System.out.println("m2 method demo 2");
    }
    default void m3()
    {
        System.out.println("m3 method demo 2");
    }
}
class democlass implements demo1, demo2
{
    public void m3()
    {
        System.out.println("m3 method democlass");
        demo1.super.m3();
        demo2.super.m3();
    }
}

public class DefaultMethodInInterface {
    public static void main(String args[])
    {
        democlass d1=new democlass();
        d1.m1();
        d1.m2();
        d1.m3();

    }
}

package core_java_programs;

class Demo2
{
    int FindSecondDigit(int n)
    {
        while(n>=100)
            n/=10;
        return n%10;

    }
}
public class FindSecondDigit {
    public static void main(String args[])
    {
        Demo2 d1=new Demo2();
        System.out.print(d1.FindSecondDigit(7457647));
    }
}

package core_java_programs;

class Demo
{
    double findAvgOfDigit(int n)
    {
        double avg=0;
        int count=0;
        while(n!=0)
        {
            avg+=n%10;
            count++;
            n/=10;
        }
        return avg/count;
    }
}
public class FindAverageOfDigit {
    public static void main(String args[])
    {
        Demo d1= new Demo();
        System.out.print(d1.findAvgOfDigit(87));
    }
}

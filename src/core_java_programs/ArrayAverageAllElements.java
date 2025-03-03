package core_java_programs;

public class ArrayAverageAllElements {
    public static void main(String args[])
    {
        int a[]={17,21,15,22,10,5,12,25};
        double avg=0; //127
        for(int i=0;i<a.length;i++)  //8<8
        {
            avg=avg+a[i];      //127=127+25
        }
        avg=avg/a.length;
        System.out.print(avg);
    }
}
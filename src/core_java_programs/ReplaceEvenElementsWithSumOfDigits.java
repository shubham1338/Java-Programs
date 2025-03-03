package core_java_programs;

import java.util.Arrays;

public class ReplaceEvenElementsWithSumOfDigits {
    public static void main(String args[]) {
        int a[] = {47, 49, 20, 57, 37, 59, 86};
        for (int i = 0; i < a.length; i++)     //3<7
        {
            if (a[i] % 2 == 0)           //20%2==0
            {
                int sum = 0;          //sum=2
                while (a[i] != 0)     //20!=0
                {
                    sum = sum + a[i] % 10;  //2=1+21%10
                    a[i] = a[i] / 10;    //20=20/10
                }
                a[i] = sum;        //47=
            }
        }
        System.out.print(Arrays.toString(a));
    }
}

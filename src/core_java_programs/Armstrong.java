package core_java_programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int remainder = 0;
        int temp = num;        //temp=153
        int result = 0;
        while (temp != 0) {            //temp=153 temp=15 temp=1 temp=0(false)
            count++;               //count=1 count=2 count=3
            temp = temp / 10;         //temp=153/10=15 temp=15/10=1 temp=1/10=0
        }
        temp = num; //temp=0 temp=153
        while (temp != 0) {               //temp=153 temp=15 temp=1 temp=0(false)
            remainder = temp % 10;         //remainder=153%10=3 remainder15%10=5 remainder=1%10=1
            result = result + (int) Math.pow(remainder, count); //result=0+3^3=27 result=27+5^3=152 result=152+1^3=153
            temp = temp / 10; //temp=153/10=15 temp=15/10=1 temp=1/10=0
        }
        if (result == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

package core_java_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  //456654
        int reverse = 0;         //0
        while (num != 0) {
            int remainder = num % 10;     //remainder= 4,  5, 6, 5,
            reverse = reverse * 10 + remainder; //reverse= 4, 5, 6, 6, 5, 4
            num = num / 10;             //num= 45665, 4566, 456,
        }
        System.out.println(reverse);
    }
}

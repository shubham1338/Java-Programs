package core_java_programs;

import java.util.*;

public class NumberPalindrome
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int temp = num;
            int reverse = 0;
            while (num != 0) {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            if (temp == reverse) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }


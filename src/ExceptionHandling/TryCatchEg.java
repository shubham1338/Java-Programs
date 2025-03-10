package ExceptionHandling;

import java.util.Scanner;

public class TryCatchEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }
}

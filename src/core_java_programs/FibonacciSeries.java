package core_java_programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range=");
        int range = sc.nextInt();
        int n1 = 0, n2 = 1;
        for (int i = 0; i < range - 2; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

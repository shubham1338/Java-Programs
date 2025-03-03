package core_java_programs;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String args[]) {
        System.out.println("enter percentage-");
        Scanner sc = new Scanner(System.in);
        float percentage = sc.nextFloat();
        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("B");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

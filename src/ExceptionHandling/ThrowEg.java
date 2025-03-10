package ExceptionHandling;

import java.util.Scanner;

class AgeException extends RuntimeException {
    AgeException(String msg) {
        super(msg);
    }
}

public class ThrowEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            throw new AgeException("you Cannot vote");
        } else {
            System.out.println("thank you for voting");
        }
    }
}

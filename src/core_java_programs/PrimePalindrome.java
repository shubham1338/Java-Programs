package core_java_programs;

public class PrimePalindrome {
    boolean PrimeNo(int num) {
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean Palindrome(int num) {

        int temp = num;
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if (temp == reverse)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        PrimePalindrome d1 = new PrimePalindrome();
        int num = 151;
        boolean isPrime = d1.PrimeNo(num);
        boolean isPalindrome = false;
        if (isPrime == true) {
            isPalindrome = d1.Palindrome(num);
        }
        if (isPrime == true && isPalindrome == true) {
            System.out.print("PP");
        } else
            System.out.print("np");
    }

}

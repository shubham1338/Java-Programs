package core_java_programs;

public class OddAndEvenNumber {
    public static void main(String args[]) {
        double num[] = {12, 48, 95, 37, 73, 20};
        double sum = 0;
        double sum1 = 0;
        int count = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] % 2 != 0) {
                sum = sum + num[i];
                count++;
            } else {
                sum1 = sum1 + num[i];
            }
        }
        sum = sum / count;
        sum1 = sum1 / (num.length - count);
        System.out.println(sum);
        System.out.println(sum1);
    }
}


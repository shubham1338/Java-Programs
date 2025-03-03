package core_java_programs;

public class FindOddAndEvenAverage {
    public static void main(String args[]) {
        double a[] = {38, 47, 39, 57, 29, 47, 29, 74};
        double oddAvg = 0;
        double evenAvg = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddAvg = oddAvg + a[i];
                count++;
            } else {
                evenAvg = evenAvg + a[i];
            }
        }
        oddAvg = oddAvg / count;
        evenAvg = evenAvg / (a.length - count);
        System.out.println(oddAvg);
        System.out.println(evenAvg);
    }

}

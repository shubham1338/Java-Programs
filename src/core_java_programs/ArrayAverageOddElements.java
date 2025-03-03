package core_java_programs;

public class ArrayAverageOddElements {
    public static void main(String args[]) {
        double a[] = {38, 47, 39, 57, 29, 47, 29, 74};
        double avg = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                avg = avg + a[i];
                count++;
            }
        }
        avg = avg / count;
        System.out.print(avg);
    }

}

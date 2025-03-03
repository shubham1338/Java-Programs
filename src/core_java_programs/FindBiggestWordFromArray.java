package core_java_programs;

public class FindBiggestWordFromArray {
    public static void main(String[] args) {
        String s1 = "welcome to international international airport";
        String s2[] = s1.split(" ");
        int max = 0;
        for (int i = 0; i < s2.length; i++) {
            if (s2[i].length() > max) {
                max = s2[i].length();
            }
        }
        for (int i = 0; i < s2.length; i++) {
            if (s2[i].length() == max) {
                System.out.print(s2[i] + " ");
            }
        }
    }
}

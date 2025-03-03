package core_java_programs;

public class ConvertVowelsIntoUppercase {

    public static void main(String[] args) {
        String s1 = "welcome to international airport";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                String s = s1.substring(i, i + 1);
                s1 = s1.substring(0, i) + s.toUpperCase() + s1.substring(i + 1);
            }
        }
        System.out.print(s1 + " ");
    }
}

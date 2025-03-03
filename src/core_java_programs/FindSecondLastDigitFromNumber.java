package core_java_programs;

class Demo3 {
    int FindSecondLastNo(int n) {
        return (n / 10) % 10;
    }

}

public class FindSecondLastDigitFromNumber {
    public static void main(String args[]) {
        Demo3 d1 = new Demo3();
        System.out.print(d1.FindSecondLastNo(13934938));
    }
}

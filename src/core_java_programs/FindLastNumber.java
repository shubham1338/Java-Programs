package core_java_programs;

class Demo1 {
    int FindLastNo(int n) {
        return n % 10;
    }

}

public class FindLastNumber {
    public static void main(String args[]) {
        Demo1 d1 = new Demo1();
        System.out.print(d1.FindLastNo(13));
    }
}

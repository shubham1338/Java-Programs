public class N3_nest {
    public static void main(String[] args) {
        int a=50, b=60 , c=30;

        String result=(a>b)?(a>c)?"a is bigger":"c is bigger":(b>c)?"b is bigger":"c is bigger";
        System.out.println(result);
    }
    
}

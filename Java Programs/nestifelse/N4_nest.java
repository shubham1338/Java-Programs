public class N4_nest {
    public static void main(String[] args) {
        int a=50,b=60,c=30,d=80;
        String result=(a>b)?(a>c)?(a>d)?"a is bigger":"d is bigger":(c>d)?"c is bigger":"d is bigger":(b>c)?(b>d)?"b is bigger":"d is bigger":(c>d)?"c is bigger":"d is bigger";
        System.out.println(result);
    }
    
}

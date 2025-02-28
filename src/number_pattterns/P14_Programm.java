package number_pattterns;

/*
12345
2345
345
45
5
*/
public class P14_Programm {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

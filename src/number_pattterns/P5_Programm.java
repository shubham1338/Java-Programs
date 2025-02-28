package number_pattterns;

public class P5_Programm {
    /* 1
     * 22
     * 333
     * 4444
     * 55555
     */
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)//i<=4
        {
            for(int j=i;j>=1;j--)//j=3 j>=3
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}

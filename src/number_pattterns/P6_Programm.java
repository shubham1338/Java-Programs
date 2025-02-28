package number_pattterns;

public class P6_Programm {
    /*
     * 
     * 
     *  5
        44
        333
        2222
        11111
     */
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}

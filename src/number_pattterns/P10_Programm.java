package number_pattterns;

public class P10_Programm {
    /*
     *  5
        45
        345
        2345
        12345
     */
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

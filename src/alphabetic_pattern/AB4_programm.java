package alphabetic_pattern;

public class AB4_programm {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
    
}

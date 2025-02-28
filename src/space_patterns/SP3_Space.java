package space_patterns;

/*
54321
4321
321
21
1
*/
public class SP3_Space
{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<1;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
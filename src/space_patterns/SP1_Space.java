package space_patterns;

/*
    *
   **
  ***
 ****
*****
*/
public class SP1_Space{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)//1<=5   1
        {
            for(int j=i;j<5;j++)//j<5  1
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)//j>=1  1
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
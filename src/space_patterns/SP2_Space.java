package space_patterns;

/*

*****
 ****
  ***
   **
    *
*/
    public class SP2_Space {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

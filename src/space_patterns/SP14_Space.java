package space_patterns;

/*
    1
   22
  333
 4444
55555
*/
public class SP14_Space {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}

package space_patterns;

/*
    5
   54
  543
 5432
54321
*/
public class SP6_Space {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

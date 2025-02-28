package space_patterns;

/*
54321
 5432
  543
   54
    5
*/
    public class SP9_Space {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
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
package space_patterns;

/*
12345
 2345
  345
   45
    5
    */
    public class SP8_Space {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
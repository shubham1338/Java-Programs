package space_patterns;

public class SP13_Space {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)  //5>=1
        {
            for(int j=i;j>1;j--)  //5>1
            {
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--)  //5<=5
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    
}
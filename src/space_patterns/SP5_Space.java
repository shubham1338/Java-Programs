package space_patterns;

public class SP5_Space {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)  //2<5 
        {
            for(int j=i;j<5;j++) //2<5
            {                                                   
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) //1<=1                     
            {                                                
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

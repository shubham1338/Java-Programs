public class N5_nest {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                if(j%2!=1)
                System.out.print(0);
                else
                System.out.print(1);
            }
            System.out.println();
        }
    }
    
}

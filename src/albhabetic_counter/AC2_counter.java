package albhabetic_counter;

public class AC2_counter {
    public static void main(String[] args) {
        int n=5;
        int count =(n*(n+1))/2;
        for(int i=1;i<=n;i++)
        {
            int c=count;
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(c+64));
            }
            System.out.println();
            count-=i;
        }
    }
    
}



public class C1_counter {
    public static void main(String[] args) {
        /*30
         *28 29
          25 26 27
          21 22 23 24
          16 17 18 19 20
         */
        
    
    int n=5;
    int count=(n*(n+1));
    for(int i=1;i<=n;i++)
    {
        int c=count;
        for(int j=i;j>=1;j--)
        {
            System.out.print(c+"\t");
            c++;
        }
        System.out.println();
        count-=i+1;
    }

}
    
}

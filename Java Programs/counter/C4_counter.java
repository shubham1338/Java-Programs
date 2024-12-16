public class C4_counter {
    /*
28	
27	21	
26	20	15	
25	19	14	10	
24	18	13	9	6	
23	17	12	8	5	3	
22	16	11	7	4	2	1	

     */
    public static void main(String[] args) 
    {
        int n=7;
        int count=(n*(n+1))/2;
        for(int i=n;i>=1;i--)
        {
            int c=count;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c-=j-1;
            }
            System.out.println();
            count--;
        }
    }
    
}

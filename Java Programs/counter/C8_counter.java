public class C8_counter {
    public static void main(String[] args) {
        /*
         * 11 12 13 14 15
         * 7  8  9  10
         * 4  5  6
         * 2  3
         * 1
         */
        int n=5;
        int count=n;

        for(int i=n;i>=5;i--)
        {
            int c=count;
            for(int j=n;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}

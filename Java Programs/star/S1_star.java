class S1_star
{
    public static void main(String[] args) {
        int n=5;
        /*

        1
        12
        123
        1234
        12345

         */

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
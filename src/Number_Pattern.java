public class Number_Pattern {
    public static void main(String[] args)
    {
        int n = 6;
        for (int i = 3; i <= n; i++)
        {
            for (int j = 3; j <= i; j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}

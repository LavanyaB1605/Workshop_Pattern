public class Star_Pattern {

        public static void main(String[] args)
        {

            int rows = 4;

            for (int i=0; i<rows-1 ; i++)
            {
                System.out.print("*" + " ");
                    
                for (int j=0; j<rows-1; j++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }


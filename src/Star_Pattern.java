import java.util.Scanner;

public class Star_Pattern {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of rows: ");

            int rows = scanner.nextInt();

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


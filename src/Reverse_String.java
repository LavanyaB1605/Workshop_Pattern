import java.util.Scanner;

public class Reverse_String {
    public static void main(String args[])
    {
        String input, reverse = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        input = scanner.nextLine();

        int length = input.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + input.charAt(i);

        System.out.println("Reverse of the string: " + reverse);
    }
}

import java.util.Scanner;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();  // consume the newline

        for (int i = 0; i < T; i++)
        {
            String input = scanner.nextLine();
            StringBuilder evenIndexed = new StringBuilder();
            StringBuilder oddIndexed = new StringBuilder();

            for (int j = 0; j < input.length(); j++)
            {
                if (j % 2 == 0)
                {
                    evenIndexed.append(input.charAt(j));
                }

                else
                {
                    oddIndexed.append(input.charAt(j));
                }
            }

            System.out.println(evenIndexed.toString() + " " + oddIndexed.toString());
        }

        scanner.close();
    }
}
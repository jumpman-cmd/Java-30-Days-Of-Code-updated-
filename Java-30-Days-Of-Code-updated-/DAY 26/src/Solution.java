import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        int fine = 0;

        if (actualYear > expectedYear)
        {
            fine = 10000;
        }

        else if (actualYear == expectedYear)
        {
            if (actualMonth > expectedMonth)
            {
                fine = 500 * (actualMonth - expectedMonth);
            }

            else if (actualMonth == expectedMonth && actualDay > expectedDay)
            {
                fine = 15 * (actualDay - expectedDay);
            }
        }

        System.out.println(fine);
        scanner.close();
    }
}
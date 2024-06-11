import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input the elements from the user
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        // Print the elements in reverse order
        for (int i = n - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        scanner.close(); // Close the scanner
    }
}
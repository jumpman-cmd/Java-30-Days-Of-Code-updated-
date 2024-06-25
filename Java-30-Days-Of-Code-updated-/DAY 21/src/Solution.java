import java.util.Scanner;

public class Solution
{
    // Generic function to print array elements
    public static <T> void printArray(T[] array)
    {
        for (T element : array)
        {
            System.out.println(element);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Read first array of integers
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++)
        {
            intArray[i] = scanner.nextInt();
        }

        // Read second array of strings
        int m = scanner.nextInt();
        String[] stringArray = new String[m];
        for (int i = 0; i < m; i++)
        {
            stringArray[i] = scanner.next();
        }

        scanner.close();

        // Call generic method to print arrays
        printArray(intArray);
        printArray(stringArray);
    }
}
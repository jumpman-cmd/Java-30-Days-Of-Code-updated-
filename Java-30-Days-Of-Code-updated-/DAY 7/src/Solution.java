import java.util.Scanner;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        scan.nextLine();
        if (arraySize >= 1 && arraySize <= 1000)
        {
            int[] array = new int[arraySize];

            for (int i = 0; i < arraySize; i++)
                {
                    array[i] = scan.nextInt();
                }

                for (int j = arraySize - 1; j >= 0; j--)
                {
                    System.out.print(array[j] + " ");
                }
        }

        else
        {
            System.out.println("Invalid Input");
        }
    }
}

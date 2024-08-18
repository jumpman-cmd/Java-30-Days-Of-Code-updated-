import java.util.Scanner;

public class SolutionB
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        // scan.nextLine();

        int[] array = new int[T];
        for (int i = 0; i < T; i++)
        {
            array[i] = scan.nextInt();
        }

        for (int j = T - 1; j >= 0 ; j--)
        {
            System.out.print(array[j] + " ");
        }
        scan.close();
    }
}

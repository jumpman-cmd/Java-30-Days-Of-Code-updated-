import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String binaryString = Integer.toBinaryString(n);
        int maxConsecutiveOnes = findMaxConsecutiveOnes(binaryString);

        System.out.println(maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(String binaryString)
    {
        int maxCount = 0;
        int currentCount = 0;

        for (char c : binaryString.toCharArray())
        {
            if (c == '1')
            {
                currentCount++;
                if (currentCount > maxCount)
                {
                    maxCount = currentCount;
                }
            }

            else
            {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
import java.util.Scanner;

public class Solution
 {

    public static int bitwiseAnd(int N, int K)
     {
        int maxAndValue = 0;
        for (int a = 1; a <= N; a++) 
        {
            for (int b = a + 1; b <= N; b++) 
            {
                int andValue = a & b;
                if (andValue < K && andValue > maxAndValue) 
                {
                    maxAndValue = andValue;
                }
            }
        }
        return maxAndValue;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++)
         {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(bitwiseAnd(N, K));
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class SolutionB
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = scan.nextLine();
            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();
            for (int j = 0; j < str.length(); j++)
            {
                if (j % 2 == 0)
                {
                    evenStr.append(str.charAt(j));
                }
                
                else
                {
                    oddStr.append(str.charAt(j));
                }
            }
            System.out.println(evenStr + " " + oddStr);
        }
        scan.close();
    }
}

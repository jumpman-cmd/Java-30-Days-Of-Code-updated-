import java.util.Scanner;

public class Solution
{
    String s;

    // Getters and setters
    public String getS()
    {
        return this.s;
    }

    public void setS(String newS)
    {
        this.s = newS;
    }

   /** public Solution(String enteredS)
    {
        if (this.s.length() >= 2 && this.s.length() <= 10000)
        {
            s = enteredS;
        }

        else
        {
            System.out.println("Invalid input. Rerun the program and enter appropriate data.");
        }
    } **/


    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        scan.nextLine();
        if (T >= 1 && T <= 10)
        {
            StringBuilder results = new StringBuilder();
            for (int z = 0; z < T; z++)
            {
                String s = scan.nextLine();
                if (s.length() >= 2 && s.length() <= 10000)
                {
                    StringBuilder evenChars = new StringBuilder();
                    StringBuilder oddChars = new StringBuilder();
                    for (int j = 0; j < s.length(); j++)
                    {
                        if (j % 2 == 0)
                        {
                            evenChars.append(s.charAt(j));
                        }

                        else
                        {
                            oddChars.append(s.charAt(j));
                        }
                    }

                    results.append(evenChars.toString()).append(" ").append(oddChars.toString()).append("\n");
                }

                else
                {
                    System.out.println("\nInvalid input. Rerun the program and enter appropriate data. Enter in a range 2 to 10000 characters.");
                    return; // Terminate the program
                }
            }

            System.out.println(results.toString());
        }

        else
        {
            System.out.println("\nInvalid Input. Enter in a range 1 to 10. Rerun the program and try again.");
        }
    }
}

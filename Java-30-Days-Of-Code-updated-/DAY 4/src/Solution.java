import java.awt.*;
import java.util.Scanner;

public class Solution
{
    private int age;

    // Constructor
    public Solution (int initialAge)
    {
        if (initialAge >= 0)
        {
            this.age = initialAge;
        }

        else
        {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }

    // Methods
    public void yearPasses()
    {
        age++;
    }

    public void amIOld()
    {
        if (age < 13)
        {
            System.out.println("You are young.");
        }

        else if (age >= 13 && age < 18)
        {
            System.out.println("You are a teenager.");
        }

        else
        {
            System.out.println("You are old.");
        }
    }

    // Getters / Accessor methods
    public int getAge()
    {
        return this.age;
    }

    // Setters / Mutator methods
    public void setAge (int newAge)
    {
        this.age = newAge;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); // T - numberofTimes
        for (int i = 0; i < T; i++)
        {
            int age = scan.nextInt();
            Solution obj1 = new Solution(age);
            obj1.amIOld();
            for (int j = 0; j < 3; j++)
            {
                obj1.yearPasses();
            }
            obj1.amIOld();
            System.out.println();
        }
        scan.close();
    }
}

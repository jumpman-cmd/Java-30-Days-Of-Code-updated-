// This is the complete code

import java.util.*;

class Person
{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print Person data
    public void printPerson()
    {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person
{
    private int[] testScores;

    // Constructor
    Student(String firstName, String lastName, int id, int[] testScores)
    {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    // Method to calculate grade
    public char calculate()
    {
        int sum = 0;
        for (int score : testScores)
        {
            sum += score;
        }
        int average = sum / testScores.length;

        if (average >= 90 && average <= 100)
        {
            return 'O'; // Outstanding
        }

        else if (average >= 80 && average < 90)
        {
            return 'E'; // Exceeds Expectations
        }

        else if (average >= 70 && average < 80)
        {
            return 'A'; // Acceptable
        }

        else if (average >= 55 && average < 70)
        {
            return 'P'; // Poor
        }

        else if (average >= 40 && average < 55)
        {
            return 'D'; // Dreadful
        }

        else
        {
            return 'T'; // Troll
        }
    }
}

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++)
        {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

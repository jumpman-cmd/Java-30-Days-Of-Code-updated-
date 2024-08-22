// Another complete code, I think this one is crystal clear.

import java.util.Scanner;

class Person
{
    protected String firstName;
    protected String lastName;
    protected String idNumber;
    
    public Person(String fName, String lName, String id)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.idNumber = id;
    }
    
    public void printPerson()
    {
        System.out.println("Name: " + firstName + ", " + lastName + "\nID: " + idNumber);
    }
}

class Student extends Person
{
    private int[] testScores; // marks for tests
    
    public Student(String fName, String lName, String id, int[] testScores)
    {
        super(fName, lName, id);
        this.testScores = testScores;
    }
    
    public char calculate()
    {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++)
        {
            sum += testScores[i];
        }
        
        double average = (double) sum / testScores.length;
        
        if (average >= 90 && average <= 100)
        {
            return 'O';
        }
        
        else if (average >= 80 && average < 90)
        {
            return 'E';
        }
        
        else if (average >= 70 && average < 80)
        {
            return 'A';
        }
        
        else if (average >= 55 && average < 70)
        {
            return 'P';
        }
        
        else if (average >= 40 && average < 55)
        {
            return 'D';
        }
        
        else
        {
            return 'T';
        }
    }
}

class Solution0
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        String fName = scan.next();
        String lName = scan.next();
        String id = scan.next();
        
        int scores = scan.nextInt(); // scores = number of tests
        int[] testScores = new int[scores];
        for(int i = 0; i < scores; i++)
        {
            testScores[i] = scan.nextInt();
        }
        
        Student object1 = new Student(lName, fName, id, testScores);
        object1.printPerson();
        System.out.println("Grade: " + object1.calculate());
    }
}

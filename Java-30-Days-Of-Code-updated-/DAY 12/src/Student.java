import java.util.Scanner;

class Student extends Person
{
    private int [] testScores;

    public Student (String fName, String lName, int identification, int [] testMarks)
    {
        super();
        this.firstName = fName;
        this.lastName = lName;
        this.idNumber = identification;
        this.testScores = testMarks;
    }
    public char calculate()
    {
        int total = 0;
        for (int i = 0; i < testScores.length; i++)
        {
            total += testScores [i];
        }

        int average = total / testScores.length;

        if (average >= 90 && average <= 100)
        {
            return 'O';
        }

        else if (average >= 80 && average < 90)
        {
            return 'E';
        }

        if (average >= 70 && average < 80)
        {
            return 'A';
        }

        if (average >= 55 && average < 70)
        {
            return 'P';
        }

        if (average >= 40 && average < 55)
        {
            return 'D';
        }

        else
        {
            return 'T';
        }
    }

    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int idNumber = scan.nextInt();
        int numScores = scan.nextInt();

        int [] testScores = new int [numScores];
        for (int i = 0; i < numScores; i++)
        {
            testScores [i] = scan.nextInt();;
        }
        scan.close();

        Student s = new Student (firstName, lastName, idNumber, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
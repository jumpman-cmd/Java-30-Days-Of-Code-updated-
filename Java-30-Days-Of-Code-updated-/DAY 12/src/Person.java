public class Person
{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Construct
    public Person  (String fName, String lName, int identification)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.idNumber = identification;
    }

    public Person() {

    }

    public void printPerson ()
    {
        System.out.println("Name: " + firstName + ", " + lastName + "\nID: " + idNumber);
    }
}
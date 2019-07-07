// Student class contains data about a student, and provides methods to manage that data
public class Student {
    
    // Creates a new Student with given first name, last name, and grade
    // Generates and assigns unique student number
    public Student(String firstN, String lastN, int g) {
        firstName = firstN;
        lastName = lastN;
        grade = g;
        // Assigns student number to latest number
        number = latestNumber;
        // Increases the static student number field
        latestNumber++;
    }

    // Counter shared by all student classes, used as unique student number for new students
    private static int latestNumber = 0;

    private String firstName;
    private String lastName;
    private int grade;
    private int number;

    public void SetFirstName(String firstN) {
        firstName = firstN;
    }

    public void SetLastName(String lastN) {
        lastName = lastN;
    }

    public void SetGrade(int g) {
        grade = g;
    }

    public void SetNumber(int num) {
        number = num;
    }

    public String GetFirstName() {
        return firstName;
    }

    public String GetLastName() {
        return lastName;
    }

    public int GetGrade() {
        return grade;
    }

    public int GetNumber() {
        return number;
    }

    // Overrides default toString method with custom string
    public String toString() {
        return "Name: " + lastName + ", " + firstName + " | Grade: " + grade + " | Number: " + number;
    }
}

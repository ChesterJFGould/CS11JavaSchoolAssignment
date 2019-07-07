// Teacher class contains data about a teacher, and provides methods to manage that data
public class Teacher {
    
    //Creates a new Teacher with given first name, last name, and subject
    public Teacher(String firstN, String lastN, String subj) {
        firstName = firstN;
        lastName = lastN;
        subject = subj;
    }

    private String firstName;
    private String lastName;
    private String subject;

    public void SetFirstName(String name) {
        firstName = name;
    }

    public String GetFirstName() {
        return firstName;
    }

    public void SetLastName(String name) {
        lastName = name;
    }

    public String GetLastName() {
        return lastName;
    }

    public void SetSubject(String subj) {
        subject = subj;
    }

    public String GetSubject() {
        return subject;
    }

    public String toString() {
        return "Name: " + lastName + ", " + firstName + " | Subject: " + subject;
    }
}

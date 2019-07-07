import java.util.concurrent.ThreadLocalRandom;

public class Main {
    // Lists of names and subjects to make random generation of students and teachers easier
    static String[] firstNames = new String[]{"Bob", "Chester", "Jasper", "Justin", "Timothy", "Alice", "Kyra", "Mattisse", "Alexia", "Jaques"};
    static String[] lastNames = new String[]{"Smith", "Gould", "LaVoile", "Soo", "Yuan"};
    static String[] subjects = new String[]{"Science d'Informatique", "Calcul Infinitesimal", "Francais", "Anglais", "Physique"};
    public static void main(String[] args) {
        // Creates a new school called "Chesters Big Boy School", in district "Harlans World 314", with a capacity of 2718
        School school = new School("Chesters Big Boy School", "Harlans World 314", 2718);
        
        // Creates 9 random students
        for (int i = 0; i < 9; i++) {
            // Picks random names from lists
            String firstName = firstNames[ThreadLocalRandom.current().nextInt(0, firstNames.length)];
            String lastName = lastNames[ThreadLocalRandom.current().nextInt(0, lastNames.length)];
            // Generates random grade between 1 and 12
            int grade = ThreadLocalRandom.current().nextInt(1, 13);
            // Creates and adds new Student to school, with the random parameters
            school.AddStudent(new Student(firstName, lastName, grade));
        }
        // Adds a new specifically named student with first name: "Takeshi", last name: "Kovacs", and grade: over 9000
        school.AddStudent(new Student("Takeshi", "Kovacs", 9001));

        // Creates 2 random teachers
        for (int i = 0; i < 2; i++) {
            // Picks random names and subject from lists
            String firstName = firstNames[ThreadLocalRandom.current().nextInt(0, firstNames.length)];
            String lastName = lastNames[ThreadLocalRandom.current().nextInt(0, lastNames.length)];
            String subject = subjects[ThreadLocalRandom.current().nextInt(0, subjects.length)];
            // Creates and adds new Teacher to school, with the random parameters
            school.AddTeacher(new Teacher(firstName, lastName, subject));
        }
        // Adds a specifically named teacher with first name "Yue Ping", last name: "Zhu", and subject: "Maoism 101"
        school.AddTeacher(new Teacher("Yue Ping", "Zhu", "Maoism 101"));

        // Prints current students, teachers, and courses to standard output
        school.PrintStudents();
        school.PrintTeachers();
        school.PrintCourses();
        // Deletes the student with student number 1, since the student numbers are assigned sequentially we can guarentee that there will be a student with student number 1
        school.DeleteStudent(1);
        // Deletes the first student with first name: "Takeshi", last name: "Kovacs", and grade: over 9000
        school.DeleteStudent("Takeshi", "Kovacs", 9001);

        // Deletes the first teacher with first name: "Yue Ping", last name: "Zhu", and subject: "Maoism 101"
        school.DeleteTeacher("Yue Ping", "Zhu", "Maoism 101");
        
        // Prints current students, teachers, and courses to stdout
        school.PrintStudents();
        school.PrintTeachers();
        school.PrintCourses();
    }
}

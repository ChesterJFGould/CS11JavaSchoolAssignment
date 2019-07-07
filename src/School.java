import java.util.ArrayList;


// The school class mainly contains a list of teachers, students, and courses, and provides methods to manage those lists
// It also contains a name, district, and capacity
public class School {

    // Creates a new school with the given name, district, and capacity
    // Note: the capacity doesn't do anything as it wasn't part of the assignment to actually implement it, it's just there for fun :)
    public School(String schoolName, String schoolDistrict, int schoolCapacity) {
        name = schoolName;
        district = schoolDistrict;
        capacity = schoolCapacity;

        teachers = new ArrayList<Teacher>();
        students = new ArrayList<Student>();
        courses = new ArrayList<String>();
    }

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<String> courses;
    private String name;
    private String district;
    private int capacity;

    // Adds a teacher to school and adds the teachers subject to courses if it isn't already there
    public void AddTeacher(Teacher teacher) {
        teachers.add(teacher);

        // Checks if courses contains the teachers subject and adds it to courses if not
        if (!courses.contains(teacher.GetSubject())) {
            courses.add(teacher.GetSubject());
            System.out.println("Added course: " + teacher.GetSubject());
        }
    }

    // Adds a student
    public void AddStudent(Student student) {
        students.add(student);
    }

    // Searches for and deletes first teacher that matches the given parameters
    public void DeleteTeacher(String firstName, String lastName, String subject) {
        // Loops through all teachers
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            // Checks if current teacher matches the given parameters
            if (teacher.GetFirstName() == firstName && teacher.GetLastName() == lastName && teacher.GetSubject() == subject) {
                teachers.remove(i);
                
                Boolean isLastTeacherForSubject = true;
                
                // Checks if any other teacher teaches the same subject as the removed teacher
                for (Teacher otherTeacher : teachers) {
                    if (otherTeacher.GetSubject() == teacher.GetSubject()) {
                        isLastTeacherForSubject = false;
                    }
                }

                // If no other teacher teaches the same subject as the removed teacher, removes the subject
                if (isLastTeacherForSubject) {
                    courses.remove(teacher.GetSubject());
                    System.out.println("Removed course: " + teacher.GetSubject());
                }

                System.out.println("Fired teacher: " + teacher);

                return;
            }
        }
    }

    // Deletes a student, given their unique student number
    public void DeleteStudent(int number) {
        // Loops through all students
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            
            // Checks if given number matches the current students number and removes them if it does
            if (student.GetNumber() == number) {
                students.remove(i);

                System.out.println("Expelled student: " + student);

                return;
            }
        }
    }

    // Searches for and deletes the first student that matches the given parameters
    public void DeleteStudent(String firstN, String lastN, int grade) {
        // Loops through all students
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            
            // Checks if current student matches search parameters and removes them if so
            if (student.GetFirstName() == firstN && student.GetLastName() == lastN && student.GetGrade() == grade) {
                students.remove(i);
                
                System.out.println("Expelled student: " + student);

                return;
            }
        }
    }

    // Prints all current students to standard output
    public void PrintStudents() {
        System.out.println("Current students:");

        for (Student student : students) {
            System.out.println("\t" + student);
        }
    }
    
    // Prints all current teachers to standard output
    public void PrintTeachers() {
        System.out.println("Current teachers:");

        for (Teacher teacher : teachers) {
            System.out.println("\t" + teacher);
        }
    }

    // Prints all courses to standard output
    public void PrintCourses() {
        System.out.println("Current courses: ");
        
        for (String course : courses) {
            System.out.println("\t" + course);
        }
    }

    public String GetName() {
        return name;
    }

    public String GetDistrict() {
        return district;
    }

    public int GetCapacity() {
        return capacity;
    }

    public void SetName(String schooName) {
        name = schooName;
    }

    public void SetDistrict(String schoolDistrict) {
        district = schoolDistrict;
    }

    public void SetCapacity(int schoolCapacity) {
        capacity = schoolCapacity;
    }
}

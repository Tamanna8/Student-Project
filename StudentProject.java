package sharmat;

import java.util.Scanner;

/**
 *
 * @author Tamanna Sharma
 */
public class StudentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Number of Students are: "
                + Student.getNumStudents());
        Student[] students = new Student[3];
        for(int i =0 ;i<students.length;i++){
            students[i]=createStudent();
        }
        Course course = new Course("Jones", students);
        displayStudent(students[1]);

        students[1].addPoints(1234);
        students[1].setFirstName("James");
        displayStudent(students[1]);
        System.out.println("num studnets: "+course.getNumStudnets());
    }

    public static void displayStudent(Student s) {
        System.out.println(s.getName() + " has earned "
                + s.getPoints() + " points.");
    }

    public static Student createStudent() {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("SID: ");
        int sid = scanIn.nextInt();
        System.out.print("First Name: ");
        String firstName = scanIn.next();
        System.out.print("Last Name: ");
        String lastName = scanIn.next();
        return new Student(lastName, firstName, sid);
    }
}

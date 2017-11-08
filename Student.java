package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public class Student {

    //fields
    private String lastName;
    private String firstName;
    private static int numStudents;
    public final int SID;
    private int points = 0;

    //constructor
    public Student() {
        numStudents++;
        SID = -1;
    }

    public Student(String lastName, int sid) {
        this.lastName = lastName;
        numStudents++;
        SID = sid;
    }

    public Student(String lastName, String firstName, int sid) {
        this.lastName = lastName;
        this.firstName = firstName;
        numStudents++;
        SID = sid;
    }
    
    public Student deepCopy(){
        Student s= new Student(this.lastName,this.firstName, this.SID);
        return s;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int newPoints) {
        points += newPoints;
    }

    public static int getNumStudents() {
        return numStudents;
    }
}

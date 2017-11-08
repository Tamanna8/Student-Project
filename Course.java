package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public final class Course {

    //fields
    private String name;
    private Student[] students;

    public Course(String name, Student[] students){
    this.name = name;
        this.students = new Student[students.length];
        
        for(int i=0;i<students.length;i++){
            this.students[i]=students[i].deepCopy();
        }
    }

    public String getName() {
        return name;

    }

    public Student[] getStudents() {
        Student[] list = new Student[students.length];
        for(int i=0;i<students.length;i++){
            list[i]=students[i].deepCopy();
        }
        return list;
    }

    public int getNumStudnets() {
        return students.length;
    }
}

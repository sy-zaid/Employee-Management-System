import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseId;
    private String courseName;
    private Set<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new HashSet<>();
    }

    public boolean enrollStudent(Student student) {
        return enrolledStudents.add(student);
    }

    public boolean isStudentEnrolled(Student student) {
        return enrolledStudents.contains(student);
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " (" + courseId + "), Enrolled Students: " + enrolledStudents;
    }
}

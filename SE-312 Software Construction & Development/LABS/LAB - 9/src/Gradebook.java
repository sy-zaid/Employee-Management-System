import java.util.HashMap;
import java.util.Map;

public class Gradebook {
    private Map<String, String> grades;

    public Gradebook() {
        this.grades = new HashMap<>();
    }

    public void recordGrade(Student student, String grade) {
        grades.put(student.getId(), grade);
    }

    public String getGrade(Student student) {
        return grades.get(student.getId());
    }

    @Override
    public String toString() {
        return "Gradebook: " + grades;
    }
}

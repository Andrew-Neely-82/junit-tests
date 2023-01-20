import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private List<Student> students;

    public Cohort() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getCohortAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGradeAverage();
        }
        return sum / students.size();
    }
    public Student findStudentById(long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}

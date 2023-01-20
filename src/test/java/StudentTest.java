import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student(1, "John Doe");
    }

    @Test
    public void testConstructor() {
        assertEquals(1, student.getId());
        assertEquals("John Doe", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(90);
        assertEquals(90, (int) student.getGrades().get(0));
    }

    @Test
    public void testGetGradeAverage() {
        student.addGrade(90);
        student.addGrade(80);
        assertEquals(85.0, student.getGradeAverage(), 0.1);
    }
}

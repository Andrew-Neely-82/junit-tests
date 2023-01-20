import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CohortTest {
  private Cohort cohort;
  private Student student1;
  private Student student2;

  @Before
  public void setUp() {
    cohort = new Cohort();
    student1 = new Student(1, "John Doe");
    student2 = new Student(2, "Jane Doe");
  }

  @Test
  public void testAddStudent() {
    cohort.addStudent(student1);
    List<Student> students = cohort.getStudents();
    assertEquals(1, students.size());
    assertEquals(student1, students.get(0));
  }

  @Test
  public void testGetCohortAverage() {
    student1.addGrade(90);
    student1.addGrade(80);
    student2.addGrade(85);
    student2.addGrade(70);
    cohort.addStudent(student1);
    cohort.addStudent(student2);
    assertEquals(81.25, cohort.getCohortAverage(), 0.1);
  }
  @Test
  public void testFindStudentById() {
    student1.addGrade(90);
    student2.addGrade(85);
    cohort.addStudent(student1);
    cohort.addStudent(student2);
    Student student = cohort.findStudentById(2);
    assertEquals(student2, student);
    student = cohort.findStudentById(3);
    assertNull(student);
  }
}

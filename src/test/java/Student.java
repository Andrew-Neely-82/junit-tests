import java.util.ArrayList;

public class Student {
  private final long id;
  private final String name;
  private final ArrayList<Integer> grades;

  public Student(long id, String name) {
    this.id = id;
    this.name = name;
    this.grades = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void addGrade(int grade) {
    grades.add(grade);
  }

  public ArrayList<Integer> getGrades() {
    return grades;
  }

  public double getGradeAverage() {
    int sum = 0;
    for (int grade : grades) {
      sum += grade;
    }
    return (double) sum / grades.size();
  }
}

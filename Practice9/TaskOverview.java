public class TaskOverview {
  private Student[] students;
  private int antStud;

  public TaskOverview(int antStud) {
    this.antStud = 0;
    students = new Student[antStud];
  }

  public int getAmountOfStudents() {
    return antStud;
  }

  public int getStudentAmountOfTasks(int studentIndex) {
    return students[studentIndex].getAntOppg();
  }

  public void addStudent(Student student) {
    if (antStud >= students.length) {
      expandArray();
    }
    students[antStud] = student;
    antStud++;
  }

  private void expandArray() {
    Student[] newStudents = new Student[students.length + 1];
    System.arraycopy(students, 0, newStudents, 0, students.length);
    students = newStudents;
  }

  public void incrementStudentTasks(int studentIndex, int increment) {
    students[studentIndex].incrementAntOppg(increment);
  }

  public String toString() {
    String result = "";
    for (int i = 0; i < antStud; i++) {
      result += students[i] + "\n";
    }
    return result;
  }

  public static void main(String[] args) {
    TaskOverview to = new TaskOverview(2);
    Student s1 = new Student("Ola", 5);
    Student s2 = new Student("Kari", 3);
    to.addStudent(s1);
    to.addStudent(s2);
    System.out.println(to);
    to.incrementStudentTasks(0, 3);
    System.out.println(to);
    System.out.println(to.getAmountOfStudents());
    System.out.println(to.getStudentAmountOfTasks(0));

  }
}

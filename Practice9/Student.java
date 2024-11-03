public class Student {
  private String name;
  private int antOppg;

  public Student(String name, int antOppg) {
    this.name = name;
    this.antOppg = antOppg;
  }

  public String getName() {
    return name;
  }

  public int getAntOppg() {
    return antOppg;
  }

  public void incrementAntOppg(int increment) {
    antOppg += increment;
  }

  public String toString() {
    return name + " har gjort " + antOppg + " oppgaver";
  }

}

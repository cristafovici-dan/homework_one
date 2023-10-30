package Student;

import java.time.LocalDate;

public class Student {
  private final String name;
  private final LocalDate dateOfBirth;
  private final String details;

  public Student(String name, LocalDate dateOfBirth, String details) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.details = details;
  }

  public String getName() { return name; }

  public LocalDate getDateOfBirth() { return dateOfBirth; }

  public String getDetails() { return details; }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }


}

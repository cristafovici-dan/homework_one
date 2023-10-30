import Student.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Student studentOne = new Student("Student 1", LocalDate.of(2022, 2, 12), "This is student 1");
        Student studentTwo = new Student("Student 2", LocalDate.of(2021, 3, 13), "This is student 2");
        Student studentThree = new Student("Student 3", LocalDate.of(2020, 2, 21), "This is student 3");
        Student studentFour = new Student("Student 4", LocalDate.of(2012, 5, 31), "This is Student 4");

        ArrayList<Student> studentSimpleList = new ArrayList<Student>();
        studentSimpleList.add(studentOne);
        studentSimpleList.add(studentTwo);
//        System.out.println(studentSimpleList.subList(0, 2));


        System.out.println("------------ My custom implementation ------------");
        StudentList studentList = new StudentList();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);
        studentList.clear();

        System.out.println(studentList);
    }
}

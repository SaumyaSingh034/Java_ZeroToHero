package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
    Integer data;
    public static void main(String[] args){
        List<Student> student = new ArrayList<>();
        student.add(new Student(41, "Dhoni"));
        student.add(new Student(25, "Shubman"));
        student.add(new Student(35, "Virat"));
        student.add(new Student(18, "Asneer"));
        student.add(new Student(32, "Rishabh"));

        Collections.sort(student);
        for(Student s : student)
            System.out.println(s);

    }
}

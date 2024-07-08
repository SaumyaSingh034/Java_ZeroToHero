package javaInterviewPrep;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args){
        Student s1 = new Student("Saumya", 1, "Physics", 88);
        Student s2 = new Student("Tryaksh", 1, "Math", 100);
        Student s3 = new Student("Rahul", 1, "English", 98);
        Student s4 = new Student("Nitin", 1, "History", 78);
        Student s5 = new Student("Amit", 1, "Chemstry", 65);
        Student s6 = new Student("Palak", 1, "Java", 55);
        Student s7 = new Student("Piyush", 1, "Sales", 100);
        Student s8 = new Student("Divya", 1, "Data", 34);
        Student s9 = new Student("Muskan", 1, "Marketing", 18);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);

        System.out.println("Student List are : "+students);
        System.out.println("********************************************* Using Java Streams ************************");
        students.stream().forEach(e-> System.out.println(e));
        System.out.println("********************************************* Marks more than 80 ************************");
        students.stream().filter(e-> e.getMarks()>80)
                .forEach(e->System.out.println(e));
        System.out.println("********************************************* Highest Marks ************************");
        int hm = students.stream().map(e-> e.getMarks()).max(Integer::compare).get();
        System.out.println(hm);

        students.stream().filter(e-> e.getMarks() == hm)
                .forEach(e-> System.out.println(e));







    }
}

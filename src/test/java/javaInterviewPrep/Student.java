package javaInterviewPrep;

public class Student {

    private String name;
    private int rollNo;
    private int marks;
    private String subject;

    public Student(String name, int rollNo, String subject, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                ", subject='" + subject + '\'' +
                '}';
    }
}

package Comparator;

public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age>that.age)
            return 1;
        else
            return -1;
    }
}

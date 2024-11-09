package SortingInterface;

public class ComparableJava implements Comparable<ComparableJava> {
    String name;
    int age;
    public ComparableJava(String name, int age){
this.name = name;
this.age = age;
    }

    @Override
    public int compareTo(ComparableJava o) {
        return Integer.compare(this.age, o.age);
    }
}

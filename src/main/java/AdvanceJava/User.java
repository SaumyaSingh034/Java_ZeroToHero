package AdvanceJava;

import java.util.Comparator;

public class User implements Comparable<User> , Comparator<User> {
    private String name;
    private Integer age;

    public User(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.getAge().compareTo(o.getAge());
    }

    @Override
    public int compare(User o1, User o2) {
        return o2.getAge().compareTo(o1.getAge());
    }
}

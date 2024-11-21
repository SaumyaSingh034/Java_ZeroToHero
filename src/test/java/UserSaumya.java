import AdvanceJava.User;

public class UserSaumya implements Comparable<UserSaumya>{

    private String name;
    private int age;

    public UserSaumya(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(UserSaumya o) {
        return 0;
    }
}

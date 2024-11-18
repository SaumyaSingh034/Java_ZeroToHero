package AdvanceJava;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        User user1 = new User("Saumya", 28);
        User user2 = new User("Palak", 26);
        User user3 = new User("Rahul", 34);
        User user4 = new User("Piyush", 31);
        User user5 = new User("Surya", 18);
        User user6 = new User("Tryaksh", 01);
        User user7 = new User("Papa", 61);
        User user8 = new User("Mummy", 58);

        List<User> userList = List.of(user1,user2,user3,user4,user5,user6,user7,user8);

        Comparator<User> compareUsingInt = Comparator.comparing(User::getAge);
        Comparator<User> compareByAgeUsingLambdas = (User user01, User user02) -> Integer.compare(user01.getAge(), user02.getAge());

        System.out.println("Sorted using compareByAgeUsingCompareInt : ");
        userList.stream().sorted(compareUsingInt).forEach(v -> System.out.println(v.getName()));
        System.out.println("Sorted using compareByAgeUsingLambdas : ");
        userList.stream().sorted(compareByAgeUsingLambdas).forEach(v -> System.out.println(v.getName()));


    }
}

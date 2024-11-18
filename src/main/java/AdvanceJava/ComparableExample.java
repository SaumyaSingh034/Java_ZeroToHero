package AdvanceJava;

import java.util.List;

public class ComparableExample {

    public static void main(String[] args){
        User user1 = new User("Saumya", 28);
        User user2 = new User("Palak", 26);
        User user3 = new User("Rahul", 34);
        User user4 = new User("Piyush", 31);
        User user5 = new User("Surya", 18);
        User user6 = new User("Tryaksh", 01);
        User user7 = new User("Papa", 61);
        User user8 = new User("Mummy", 58);

        List<User> userList = List.of(user1,user2,user3,user4,user5,user6,user7,user8);
        userList.stream().sorted().forEach(v->System.out.println(v.getName()+" ----> "+v.getAge()+" "));

    }
}

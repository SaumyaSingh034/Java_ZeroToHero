package VIMO_Fitment;

import java.util.List;

public class CompTest {

    public static void main(String[] args){
        UserSaumya user1 = new UserSaumya("Saumya", 28);
        UserSaumya user2 = new UserSaumya("Palak", 26);
        List<UserSaumya> userList = List.of(user1, user2);
        //list1.stream().sorted().forEach(v->System.out.println(v.getAge()));
       // System.out.println(list.get(0).getAge());
        userList.stream().sorted().forEach(v->System.out.println(v.getName()+" ----> "+v.getAge()+" "));

    }
}

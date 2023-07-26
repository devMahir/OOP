package GenericList;
import java.util.ArrayList;
import java.util.List;

public class Oop {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Adnan", "Gold"));
        users.add(new User("Mahir"));        
        users.add(new User("Shahriar"));

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).get_name());
        }

        for(User u : users){
            System.out.println(u.get_name());
        }

        
    }
}

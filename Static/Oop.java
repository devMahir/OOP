package Static;

import java.util.ArrayList;

public class Oop {
    public static void main(String[] args) {
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Adnan", "Gold"));
        User.admins.add(new User("Mahir"));        
        User.admins.add(new User("Shahriar"));

        for (int i = 0; i < User.admins.size(); i++) {
            System.out.println(User.admins.get(i).get_name());
        }

        for(User u : User.admins){
            System.out.println(u.get_name());
        }

        
    }
}

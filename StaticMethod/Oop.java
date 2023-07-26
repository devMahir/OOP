package StaticMethod;

import java.util.ArrayList;

public class Oop {
    public static void main(String[] args) {
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Adnan", "Gold"));
        User.admins.add(new User("Mahir"));        
        User.admins.add(new User("Shahriar"));

        User.print_admin_name();        
    }
}

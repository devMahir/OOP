package Inheritence;

import java.util.ArrayList;

public class Oop {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.get_verified());
        s.set_membership("Gold");
        System.out.println(s.get_membership());


        /*
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Adnan", "Gold"));
        User.admins.add(new User("Mahir"));        
        User.admins.add(new User("Shahriar"));

        User.print_admin_name();  */
        
        
    }
}

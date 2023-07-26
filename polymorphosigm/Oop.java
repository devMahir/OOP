package polymorphosigm;

import java.util.ArrayList;

public class Oop {
    public static void main(String[] args) {

        Student s = new Student();
        s.set_name("Student");
        Teacher t = new Teacher();
        t.set_name("Teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);

        User.admins.add(new User("Adnan", "Gold"));
        User.admins.add(new User("Mahir"));        
        User.admins.add(new User("Shahriar"));

        for(User u : User.admins){
            u.verify();
        }
        
        
    }
}

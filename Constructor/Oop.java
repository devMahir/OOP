package Constructor;

public class Oop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        User u = new User("Mahir", "Green");
        User u2 = new User();

        System.out.println(u.get_name());        
        System.out.println(u.get_membership());
    }
}
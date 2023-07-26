public class Oop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        User u = new User();
        u.set_name("Mahir");
        u.set_membership(User.Membership.Gold);



        System.out.println(u.get_name());        
        System.out.println(u.get_membership());
    }
}
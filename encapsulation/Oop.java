public class Oop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        User u = new User();
        u.set_name("Mahir");

        //User u2 = new User();
        //u2.name = "Adnan";
        //u2.membership = "Premium";


        System.out.println(u.get_name());        
        //System.out.println(u2.name);
        //System.out.println(u.age);
    }
}
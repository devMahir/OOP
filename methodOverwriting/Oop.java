package methodOverwriting;

public class Oop {
    public static void main(String[] args) {
        User u = new User("Mahir", "Green");
        User u2 = new User("Mahir", "Green");

        System.out.println(u.equals(u2));        
        //System.out.println(u.get_membership());
    }
}

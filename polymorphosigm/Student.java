package polymorphosigm;

public class Student extends User {
    void verify(){
        System.out.println("Verifing through phone");
        set_verified(true);
    }
}

package polymorphosigm;

public class Teacher extends User {
    void verify(){
        System.out.println("Verifing through mail");
        set_verified(true);
    }
}

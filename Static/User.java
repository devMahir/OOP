package Static;

import java.util.List;

public class User {
    private String _name;
    private String _membership;

    public static List<User> admins;

    public String toString(){
        return get_name() + " " + get_membership();
    }

    public boolean equals(User u2){
        if (get_name() == u2.get_name() && get_membership() == u2.get_membership()) {
            return true;
        }else{
            return false;
        }
    }
    
    public User(){

    }

    public User(String name){
        set_name(name);
    }
    
    public User(String name, String membership){
        set_name(name);
        set_membership(membership);
    }

    void set_name(String name){
        _name = name;
    }

    String get_name(){
        return _name;
    }

    void set_membership(String membership){
        _membership = membership;
    }

    void set_membership(Membership membership){
        _membership = membership.name();
    }

    public enum Membership{
        Bronze, Silver, Gold;
    }

    String get_membership(){
        return _membership;
    }
}

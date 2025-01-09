package module2.level_17_reflection.example1;

import java.lang.annotation.Inherited;

public class User {

    Long id;
    String firstName;
    String lastName;

    private static Long t = 10L;

    public boolean sex;

    protected String address;

    public final int MAX_AGE = 120;
    public static final int MIN_AGE = 0;

    public User(Long id, String firstName, String lastName, boolean sex, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
    }

    public User() {
    }

//    private User(Long id) {
//        this.id = id;
//    }

    public void doNothing1() {
    }

    void doNothing2() {

    }

}

package module1.level12_objects.example1;

public class App {
    public static void main(String[] args) {

        Admin user1 = new Admin();

        System.out.println(user1.toString());

        user1.doNothing();
        user1.doAdmin();

    }

}

class User extends Object {

    private Integer id;
    private String login;
    private String password;
    private long hash;

    public void doNothing(){
        System.out.println("привет!");
    }

    User(){
        id = 0;
        login = "unknownLogin";
        password = "unknownPassword";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", hash=" + hash +
                '}';
    }

}

class Admin extends User {

    public void doAdmin(){
        System.out.println("Администрирую!");
    }

}
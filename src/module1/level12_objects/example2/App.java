package module1.level12_objects.example2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        User u1 = new User(console.nextInt(), console.nextLine());

        System.out.println(u1);


    }
}

class User extends Object {

    private Integer id;
    private String login;
    private String password;
    private long hash;

    public void doNothing() {
        System.out.println("привет!");
    }

    User(int i, String l) {
        System.out.println("Начало работы конструктора");
        id = i;
        login = l;
        System.out.println("Конец работы конструктора");
    }

    public User() {
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
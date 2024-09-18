package module1.level12_objects.example3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        User us = new User(1, "qwerty");

        Scanner console = new Scanner(System.in);
        System.out.println("Введите старый пароль");


        if (console.nextLine().equals(us.getPassword())){
            // Я ДОЛЖЕН ДАТЬ ВОЗМОЖНОСТЬ СМЕНИТЬ ПАРОЛЬ
            System.out.println("ВВЕДИТЕ НОВЫЙ ПАРОЛЬ:");
            us.setPassword(console.nextLine());
        }

        System.out.println(us.getPassword());

    }
}

class User {
    private int id;
    private String password;

    public User(int id, String name) {
        this.id = id;
        this.password = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + password + '\'' +
                '}';
    }
}

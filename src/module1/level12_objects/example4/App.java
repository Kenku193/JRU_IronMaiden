package module1.level12_objects.example4;

import java.util.Objects;

public class App extends Object {

    public static void main(String[] args) {

        User user1 = new User("Ivan", "1234567890");
        User user2 = new User("Ivan", "1234567890");

        User user3 = user1;

        user1.equals(user3);

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));


        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}

class User {
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(login, user.login)) return false;
        return Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

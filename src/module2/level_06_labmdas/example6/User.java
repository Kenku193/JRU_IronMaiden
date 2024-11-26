package module2.level_06_labmdas.example6;
/**
 * Обычный класс User с двумя полями, конструктором и toString
 */
public class User {

    String firstName;

    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

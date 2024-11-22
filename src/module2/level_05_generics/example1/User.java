package module2.level_05_generics.example1;

public class User<T> {

    T parameter;

    public User(T parameter) {
        this.parameter = parameter;
    }
}

class App {
    public static void main(String[] args) {

        User<Integer> user = new User<>(30);

    }
}

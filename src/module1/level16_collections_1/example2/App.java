package module1.level16_collections_1.example2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ValueObject<Boolean> voBoolean = new ValueObject<>(true);
        ValueObject<Integer> voInteger = new ValueObject<>(10);
        ValueObject<String> voString = new ValueObject<>("Text");

        User user = new User();

        ValueObject<User> voUser = new ValueObject<>(user);

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user);

    }
}

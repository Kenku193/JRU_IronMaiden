package module1.level16_collections_1.example4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

}

class Application{
    public static void main(String[] args) {
        Person person = new Person("ImyaReg");

        Class<? extends Person> aClass = person.getClass();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

        Person person1 = new Person("ImyaReg");

    }
}

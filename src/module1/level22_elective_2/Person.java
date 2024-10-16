package module1.level22_elective_2;

import java.util.Collections;
import java.util.List;

public class Person {
    transient Long id;
    String name;
    String lastName;
    Long accountNumber;

    public Person(Long id, String name, String lastName, Long accountNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public void myMethod(int x, int y){
        int r = x + y;
        return;
    }
}

class App {
    public static void main(String[] args) {

       // Collections.sort(List.of(23,9,1));

        Person person = new Person(1L, "Yura", "S", 922883L);
        person.myMethod(10,20);
        Object p = new Object();

        boolean b = p instanceof Person;
        System.out.println(b);

        if (b){ // false
            System.out.println("Да, это объект класса Person");
        }

    }
}

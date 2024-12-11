package module2.level_09_object.example1;

import module2.level_09_object.example1.entity.Person;

public class App2 {
    public static void main(String[] args) {

        Person person = new Person("Gandalf");

        System.out.println("Это стандартный toString()");
        System.out.println(person);

        System.out.println("-".repeat(100));

        // getClass().getName()
        Class<? extends Person> a = person.getClass();
        String n = a.getName();

        System.out.println(n);
        System.out.println("@");


        //Integer.toHexString(hashCode())

        int i = person.hashCode();
        String hexString = Integer.toHexString(i);

        System.out.println(hexString);

        System.out.println("-".repeat(100));

        System.out.println("Мой самодельный и такой-же как у Object");
        System.out.println(n + "@" + hexString);

        String s = person.parentToString();
        System.out.println(s);

    }
}

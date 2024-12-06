package module2.level_08_constructorsAndStatic.example0;

public class Parent {
    static int count = 10;
    public int id;

    public Parent() {
    }
}

class Child extends Parent {
    static int value = -1;
    public int id; // 4 байта

    public Child() {
    }
}

class App {
    public static void main(String[] args) {

        System.out.println(Child.value);
        System.out.println(Child.count);
        System.out.println(Parent.count);

        Child a = new Child();
        System.out.println(a.id);

        // bootstrap classloader
        // platform classloader
        // app classloader
    }
}
package module2.level_08_constructorsAndStatic.example1;

public class Cat {
    public static String namePrefix;

    static {
        namePrefix = "Barsik";
        namePrefix = "Kotik";
    }

    public int a;
    public int b;
    public int c;

    {
        a = 5;
    }
    {
        b = a + 1;
    }
    {
        c = a * b;
    }
    public Cat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class Catsone extends Cat {
    public Catsone(int a, int b, int c) {
        super(a, b, c);
    }
}

class App {
    public static void main(String[] args) {
        System.out.println(Cat.namePrefix);
        Cat c = new Cat(1,2,3);
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
    }
}

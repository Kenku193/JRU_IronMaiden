package module2.level_08_constructorsAndStatic.example2;
public class Department {



    // 2 -> ??? значение по-умолчанию или?
    {
        System.out.println("logic (1) id= " + this.id);
        // Проверка и инициализация параметров конкретного объекта
        // СТАРТ: ДО КОНСТРУКТОРА КЛАССА
    }

    // 1
    static {
      //  System.out.println("static logic" + k);
        System.out.println("static logic");
        // Проверка и инициализация базовых параметров, необходимых
        // для функционирования приложения (всего класса)
        // СТАРТ: ПРИ ПЕРВОМ ОБРАЩЕНИИ К ЛЮБОМУ МЕТОДУ КЛАССА
    }

    private int id = 7;

    // private static int k = 10;

    // ПОСЛЕДНЕЕ
    public Department(int id) {
        this.id = id;
        System.out.println("конструктор id= " + id);
    }

    public int getId() {
        return id;
    }

    {
        // так тоже можно, но весьма путает код при чтении
        System.out.println("logic (2) id= " + id);
    }
}

class Runner {
    public static void main(String[] args) {
        new Department(18);
    }
}
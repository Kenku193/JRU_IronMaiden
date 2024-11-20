package module2.level_04_interfaces.contracts;

public interface InterfaceWithStaticMethod {

    String s = "Я значение поля объявленного в интерфейсе"; // public static final

    private static void someMethod() {
        // КАКАЯ-ТО ПРОВЕРКА
    }

    static void toConsole() {
        System.out.println("Я статический метод в интерфейсе");
    }

}

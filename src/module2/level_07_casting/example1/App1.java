package module2.level_07_casting.example1;

public class App1 {
    public static void main(String[] args) {
        // ТИП_ДАННЫХ   ИМЯ_ПЕРЕМЕННОЙ    ОБЪЕКТ (КТО ОН ПО СВЕОЙ СУТИ)
        // КОНТРАКТ
        Cat cat = new Cat();
        Dog dog = new Dog();

       // animal = cat; // ССЫЛКУ

        System.out.println(cat instanceof Cat); // СУЩНОСТЬ ЧЕГО ?
        System.out.println(cat instanceof Animal); // СУЩНОСТЬ ЧЕГО ?
        System.out.println(cat instanceof Run); // СУЩНОСТЬ ЧЕГО ?

        // dog = (dog) cat;

        Dog dog1 = new Dog();
        Animal animal1 = dog1;


    }
}

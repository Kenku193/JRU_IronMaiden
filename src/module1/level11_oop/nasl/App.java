package module1.level11_oop.nasl;

public class App {
    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();
        tiger1.age = 19;
        tiger1.name = "Mufasa";
        tiger1.poloski = 333;

        Cat cat1 = new Cat();
        Lion lion1 = new Lion();

        Cat[] cats = new Cat[3];

        Duck duck = new Duck();

        SomeAnimalAlsoATiger someAnimalAlsoATiger = new SomeAnimalAlsoATiger();
        cats[0] = cat1;
        cats[1] = tiger1;
        cats[2] = someAnimalAlsoATiger;

    }
}

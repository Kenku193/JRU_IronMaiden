package module2.level_05_generics.example3;

public class App {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        Box<Tiger> tigerBox = new Box<>();
        tigerBox.setValue(tiger);

        Box<Cat> catBox = new Box();
        catBox.setValue(cat);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);

        Box box = new Box();
       // box.



    }
}

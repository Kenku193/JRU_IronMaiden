package module2.level_05_generics.example2;

import module2.level_05_generics.example2.entity.Animal;
import module2.level_05_generics.example2.entity.Bone;
import module2.level_05_generics.example2.entity.Corn;

public class App {
    public static void main(String[] args) {

        Animal<Bone> dog = new Animal<>();
        dog.eat(new Bone());

        Animal<Corn> parrot = new Animal<>();
        parrot.eat(new Corn());

        Animal fish = new Animal();

    }
}

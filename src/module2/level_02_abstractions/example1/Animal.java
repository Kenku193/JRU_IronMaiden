package module2.level_02_abstractions.example1;

public abstract class Animal {
    abstract void talk();

    void doNothing(){
        System.out.println("Я обыкновенный метод в абстрактном классе");
    }
}

class Dog extends Animal{
    @Override
    void talk() {
        System.out.println("ГАВ");
    }
    void bite(){
        System.out.println("КУСЬ");
    }
}

class Cat extends Animal {
    @Override
    void talk() {
        System.out.println("МЯУ");
    }
}

class Bird extends Animal{

    @Override
    void talk() {
        System.out.println("ЧИРИК");
    }
}

class App {
    public static void main(String[] args) {

        Animal animal = new Animal(){ // ЗДЕСЬ РОДИТСЯ НЕ Animal, А ЕГО НАСЛЕДНИК
            @Override
            void talk() {
                System.out.println("Я НАСЛЕДНИК Animal - ГАВ ИЛИ НЕ ГАВ?");
            }
        };

        animal.doNothing();
        animal.talk();

        Animal dog = new Dog();
        dog.talk();

        Animal cat = new Cat();
        Animal fish = new Bird();

    }
}




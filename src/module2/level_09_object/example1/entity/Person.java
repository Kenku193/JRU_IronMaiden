package module2.level_09_object.example1.entity;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    // СОМНИТЕЛЬНО, НО ОК
    public String parentToString(){
        return super.toString();
    }
}

package module2.level_07_casting.example1;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    public void moew(){}

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }

}

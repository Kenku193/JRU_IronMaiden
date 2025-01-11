package module2.level_18_annotations.example2Anno;

import java.beans.JavaBean;
import java.lang.annotation.Annotation;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Class<Human> humanClass = Human.class;

        Annotation[] declaredAnnotations = humanClass.getDeclaredAnnotations();
        Arrays.stream(declaredAnnotations).forEach(System.out::println);

    }
}

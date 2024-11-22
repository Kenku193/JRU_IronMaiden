package module2.level_05_generics.example5;

import java.util.ArrayList;
import java.util.List;

public class Util {
    // возвр знач  имя     (параметры) тело
   public static <T extends Number> T castValue(Object o) {
       return (T) o;
   }

}

class App {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(1);
        list.add(2.0);
        list.add(null);


        for (Object element : list) {
            System.out.println(Util.<Integer>castValue(element));
        }

    }
}

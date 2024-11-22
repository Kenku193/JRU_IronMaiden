package module2.level_05_generics.example1;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add( 1 );

        for (Object o : arrayList) {
           // String s = (String) o;
            String s = o.toString(); // НЕ ТО ЖЕ САМОЕ ЧТО И ПРИВЕДЕНИЕ ТИПА
        }

    }
}

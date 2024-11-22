package module2.level_05_generics.example1;

import module2.level_04_interfaces.entity.Boat;

import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add("один");
        arrayList.add(true);
        arrayList.add(null);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        System.out.println("-".repeat(100));

        // X instanceof Y
        System.out.println("instanceof");
        Integer x = 2;
        System.out.println(x instanceof Integer);
        System.out.println(arrayList.get(0) instanceof Integer);
        System.out.println(arrayList.get(1) instanceof String);
        System.out.println(arrayList.get(2) instanceof Boolean);

        System.out.println(arrayList.get(0) instanceof String);

        System.out.println(x instanceof Object);

        Integer i = (Integer) arrayList.get(0);
//        String s = (String) arrayList.get(0);
//        Boolean b = (Boolean) arrayList.get(0);

        System.out.println("-".repeat(100));

        System.out.println(arrayList.get(3));

        System.out.println(arrayList.get(3) instanceof Object);

        // КОНТРАКТ    САМ ОБЪЕКТ
        Integer n  =  null;

        System.out.println(n instanceof Integer);

    }
}

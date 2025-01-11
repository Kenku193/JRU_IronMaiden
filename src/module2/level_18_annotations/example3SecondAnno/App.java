package module2.level_18_annotations.example3SecondAnno;

import jdk.jfr.DataAmount;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class App {

    public static void main(String[] args) throws IllegalAccessException {

        Client client = new Client();
        client.id = 222;

        Class<? extends Client> refl = client.getClass();

        Field[] declaredFields = refl.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getModifiers() + " " + field.getType() + " " + field.getName());
        }

        Integer gettedId = (Integer) declaredFields[0].get(client);
        System.out.println(gettedId);

        declaredFields[0].set(client, 555);
        gettedId = (Integer) declaredFields[0].get(client);
        System.out.println(gettedId);

        Annotation[] declaredAnnotations = declaredFields[0].getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        TudaSuda annotation = declaredFields[0].getAnnotation(TudaSuda.class);
        if (annotation.isOk()) {
            System.out.println("IS OK - MEANS OK!");
        } else {
            System.out.println("IS OK - NOW FALSE!");
        }

//        for (Field f : declaredFields) {
//            TudaSuda annotation = f.getAnnotation(TudaSuda.class);
//
//            if (annotation.isOk()) {
//                System.out.println("IS OK - MEANS OK!");
//            }
//            else {
//                System.out.println("IS OK - NOW FALSE!");
//            }
//        }

    }
}

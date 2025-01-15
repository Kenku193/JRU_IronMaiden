package module2.level_17_reflection.example1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppAboutClass {
    public static void main(String[] args) {

        Class<User> uClass = User.class;

        String name = uClass.getName();

        System.out.println(name);

        Field[] fields = uClass.getFields();

//        for (int i = 0; i < fields.length; i++) {
//            System.out.println(fields[i].getName());
//        }

        Field[] declaredFields = uClass.getDeclaredFields();

        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i].getName());
        }

        System.out.println("-".repeat(100));

        Method[] methods = uClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

        System.out.println("-".repeat(100));

        Constructor<?>[] constructors = uClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("-".repeat(100));

        Annotation[] annotations = uClass.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println(uClass.getSimpleName());

        Constructor<?>[] declaredConstructors = uClass.getConstructors();
        try {
            Object o = declaredConstructors[0].newInstance(2L, "X", "Y", true, "Addr");
            User u = (User) o;
            System.out.println(u.id);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}

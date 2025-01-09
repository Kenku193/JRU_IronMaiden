package module2.level_17_reflection.example1;

import java.lang.reflect.Field;

public class AppAboutObject {
    public static void main(String[] args) throws IllegalAccessException {

        User user = new User(3L, "Lenny", "Krawitz", true, "LA");

        Class<? extends User> aClass = user.getClass();

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field declaredField = declaredFields[0];
        Class<?> type = declaredField.getType();
        System.out.println(type.getSimpleName());

        var o = declaredField.get(user);
        System.out.println(o.getClass().getSimpleName());

        System.out.println("-".repeat(100));

        Field declaredFieldNamba0 = declaredFields[0];
        System.out.println(user.id);
        System.out.println(declaredFieldNamba0.getName() + " = " + declaredFieldNamba0.get(user));
        declaredFieldNamba0.set(user, 101L);
        System.out.println(user.id);
        System.out.println(declaredFieldNamba0.getName() + " = " + declaredFieldNamba0.get(user));

        System.out.println("-".repeat(100));

        Field declaredFieldNamba3 = declaredFields[3];
        declaredFieldNamba3.setAccessible(true);
        System.out.println(declaredFieldNamba3.getName() + " = " + declaredFieldNamba3.get(user));
        declaredFieldNamba3.set(user, 303L);
        System.out.println(declaredFieldNamba3.getName() + " = " + declaredFieldNamba3.get(user));

        System.out.println("-".repeat(100));

        Field declaredFieldNamba6 = declaredFields[6];
        declaredFieldNamba6.setAccessible(true);
        System.out.println(user.MAX_AGE);
        System.out.println(declaredFieldNamba6.getName() + " = " + declaredFieldNamba6.get(user));
        declaredFieldNamba6.set(user, 200);
        System.out.println(declaredFieldNamba6.getName() + " = " + declaredFieldNamba6.get(user));

        System.out.println("-".repeat(100));

        int modifiers = declaredFieldNamba3.getModifiers();
        System.out.println(modifiers);
    }
}

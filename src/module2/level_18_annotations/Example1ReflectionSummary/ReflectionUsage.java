package module2.level_18_annotations.Example1ReflectionSummary;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUsage {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> c = String.class;

        // ДАЛЕЕ Я НЕ ЗНАЮ ЧТО ЭТО ЗА КЛАСС, НО МОГУ ПОЛУЧИТЬ ЕГО МЕТОДЫ

        for (Method method : c.getDeclaredMethods()
        ) {

            String name = method.getName();
            Class<?>[] types = method.getParameterTypes();
            String returnType = method.getReturnType().getSimpleName();
            System.out.printf("%s %s(%s)\n", returnType, name, Arrays.toString(types));
        }

        // ИЛИ ИНТЕРФЕЙСЫ

        for (Class<?> inter : c.getInterfaces()) {
            System.out.println(inter);
        }

        // ИЛИ СОЗДАТЬ ЭКЗЕМПЛЯР

        Constructor<?> constructor = c.getConstructor(String.class);
        Object o = constructor.newInstance("Hi");
        System.out.println(o);

        // ИЛИ НАЙТИ И ВЫЗВАТЬ НУЖНЫЙ МЕТОД

        System.out.println("-".repeat(100));
        Method method = c.getMethod("getBytes");
        Annotation[] annotations = method.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotations));

//         System.out.println(method.invoke(o));

        // ИТД - НАБЕРИТЕ В СЛЕДУЮЩЕЙ СТРОЧКЕ c. и это будет Reflection API
        c.getCanonicalName();


    }
}

package module2.level_06_labmdas.example6;

public class App6 {
    public static void main(String[] args) {

         /* НА ОСНОВАНИИ ФУНКЦИОНАЛЬНОГО ИНТЕРФЕЙСА МЫ МОЖЕМ ВОСПОЛЬЗОВАТЬСЯ КАК ЛЯМБДОЙ...
           ТАК И ССЫЛКОЙ НА МЕТОД, ВЕДЬ "ПОД КАПОТОМ" В JVM ПРОИСХОДИТ ОДНО И ТО ЖЕ

           НО! КОГДА МЫ ХОТИМ ВОСПОЛЬЗОВАТЬСЯ НЕ ПРОСТО МЕТОДОМ, А КОНСТРУКТОРОМ КЛАССА
           ПОСЛЕ :: МЫ ПИШЕМ КЛЮЧЕВОЕ СЛОВО new
         */

        // User           User
        UserFactory uF = User::new;
        User user = uF.create("Ivan", "Ivanov");

        System.out.println(user);

    }
}

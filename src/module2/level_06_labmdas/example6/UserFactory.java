package module2.level_06_labmdas.example6;
/**
 * Простейший функциональный интерфейс
 * <p>
 * В нем один нереализованный метод create, принимающий два строковых аргумента
 *
 */
public interface UserFactory {

   User create (String name, String lastName);

}

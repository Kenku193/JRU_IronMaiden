package module1.level09_methods_part_2;

public class Example8 {
    public static void main(String[] args) {

        String str1 = "Привет!"; // КОРОТКАЯ ФОРМА - STRING POOL
        String str2 = "Привет!";
        String str3 = new String("Привет!"); // ПОЛНАЯ ФОРМА
        String str4 = new String("Привет!").intern();

        System.out.println("Строка 1 равна строке 2? " + (str1 == str2));
        System.out.println("Строка 2 равна строке 3? " + (str2 == str3));
        System.out.println("Строка 4 равна строке 1? " + (str4 == str1));
        System.out.println("Строка 4 равна строке 3? " + (str4 == str3));


    }
}

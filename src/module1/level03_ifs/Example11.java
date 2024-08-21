package module1.level03_ifs;

public class Example11 {

    public static void main(String[] args) {
        // ссылка      содержимое
        String text = "Привет";
        //    ссылка    ссылка
        String message = text;

        System.out.println("1: " + (text == message)); // СРАВНИВАЮ ССЫЛКИ

        // // // // // // // // // // // // // // // // // // // // // // // //

        String s1 = "Привет"; // ссылка1 на свой объект
        String s2 = "ПРИВЕТ"; // ссылка2 на свой объект
        System.out.println("2: " + (s1 == s2));
        System.out.println("3: " + s1.equals(s2)); // ПО СОДЕРЖИМОМУ

        String s3 = s1.toUpperCase(); // ПЕРЕВЕДИ В ВЕРХИНЙ РЕГИСТР - ПРИВЕТ
        System.out.println(s3);

        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

    }

}

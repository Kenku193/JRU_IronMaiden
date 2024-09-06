package module1.level09_methods_part_2;

public class Example9 {
    public static void main(String[] args) {

        String myString1 = "            ";
        System.out.println(myString1.length());
        System.out.println(myString1.isEmpty());
        System.out.println(myString1.isBlank());

        String myString2 = "Строка с текстом";
        System.out.println(myString2.charAt(4));
        for (int i = 0; i < myString2.length(); i++) {
            System.out.println(myString2.charAt(i));
        }

        String myString3 = "Some/text/and/some/more/text";
        String[] myStirng3Array = myString3.split("/");
        for (String s : myStirng3Array) {
            System.out.println(s);
        }

        // VARARG - ВАРИАТИВНЫЙ АРГУМЕНТ
        String words = String.join(" ", ".первая строка", ".втроая строка", ".третья строка", ".четвертая строка");
        System.out.println(words);

    }
}

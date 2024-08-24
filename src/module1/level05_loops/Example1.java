package module1.level05_loops;

public class Example1 {
    public static void main(String[] args) {

       int n = 5; // ЧИСЛО n РАВНО 5
       while (n > 0) { // ПОКУДА ЧИСЛО n БОЛЬШЕ ЧЕМ 0 ЦИКЛ БУДЕТ РАБОТАТЬ
           System.out.println("Hello!"); // ТО ЧТО БУДЕТ ПРОИСХОДИТЬ
           // НУЖНО КАК-ТО ПОМЕНЯТЬ ЗНАЧЕНИЕ ПЕРЕМЕННОЙ n
           // ЧТОБЫ УСЛОВИЕ ЦИКЛА СТАЛО false
           n--; // n - 1 -> НА ПЕРВОМ КРУГЕ ЦИКЛА n СТАЛА РАВНА 4
                // 4 - 1 = 3
                // 3 - 1 = 2
                // 2 - 1 = 1
                // 1 - 1 = 0
       }

        System.out.println(n);

       // ПРОГРАММА ПРОДОЛЖАЕТ ДЕЛАТЬ ТО, ЧТО ОПИСАНО НИЖЕ
        System.out.println("Дальнешие действия программы");


    }
}

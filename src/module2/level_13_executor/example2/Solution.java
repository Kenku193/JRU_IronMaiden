package module2.level_13_executor.example2;

public class Solution {
    public static void main(String[] args) {

        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();

        printer1.setPriority(Thread.MAX_PRIORITY);
        printer2.setPriority(Thread.NORM_PRIORITY);
        printer3.setPriority(Thread.MIN_PRIORITY);

        printer1.start();
        printer2.start();
        printer3.start();

    }
}

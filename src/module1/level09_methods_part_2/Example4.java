package module1.level09_methods_part_2;

public class Example4 {

    public int count = 0;
    public int sum = 0;

    public void add(int data) {
        sum = sum + data; // 0 + 10 = 20
        System.out.println("sum класса " + sum);
        int sum = data * 2; // 10 * 2 = 20
        System.out.println("sum метода " + sum);

        System.out.println(this.sum);

        count++;
        System.out.println("Счетчик вызовов метода " + count);
    }

    public static void main(String[] args) {

        Example4 e = new Example4();
        System.out.println(e.count);
        System.out.println(e.sum);
        e.add(10);

    }
}

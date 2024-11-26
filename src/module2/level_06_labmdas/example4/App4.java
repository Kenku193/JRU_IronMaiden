package module2.level_06_labmdas.example4;

public class App4 {
    public static void main(String[] args) {

//        Calculable summator = new Calculable() {
//            @Override
//            public int calculate(int x, int y) {
//                return x + y;
//            }
//        };

        Calculable summator = (x, y) -> x + y;

        System.out.println(summator.calculate(7, 9));

//        Calculable multiplyer = new Calculable() {
//            @Override
//            public int calculate(int x, int y) {
//                return x * y;
//            }
//        };

        Calculable multiplyer = (x, y) -> x * y;

        System.out.println(multiplyer.calculate(5, 4));

    }
}

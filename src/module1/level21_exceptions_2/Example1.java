package module1.level21_exceptions_2;

public class Example1 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
//        try {
             calculator.division(10, 0);
//        }
//        catch (ArithmeticException y){
//            System.out.println(y != null);
//        }


        try {
            calculator.sum(50, 60);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

class Calculator{

    public void division(int x, int y){
        System.out.println(x / y);
    }

    public void sum(int a, int b){
        throw new ArithmeticException("Привет!");
        //System.out.println(a + b);
    }

}

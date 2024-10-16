package module1.level22_elective_2;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        // 5! = 1 * 2 * 3 * 4 * 5
        BigInteger result = null;
       // try {
           result = factorial(123_456);
      //  }
//        catch (Error e){
//            System.out.println("Перехватили ошибку");
//        }

        System.out.println(result);

    }

    private static BigInteger factorial(int argument) {
        if (argument < 0){
            throw new IllegalArgumentException("Не корректный аргумент");
        }
        else if (argument < 2) {
            return BigInteger.ONE;
        }
        else {
           // argument * factorial(argument - 1)
           BigInteger left = BigInteger.valueOf(argument);
           BigInteger right = factorial(argument - 1); // 5 - 1
           return left.multiply(right);
        }
    }

}

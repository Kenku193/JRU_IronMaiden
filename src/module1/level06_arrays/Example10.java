package module1.level06_arrays;

public class Example10 {
    public static void main(String[] args) {

        double[] doubles1 = {1.0, 2.0, 10.1, -9.2};

        // НЕ КОПИРОВАНИЕ МАССИВА!
        // КОПИРОВАНИЕ ССЛЫКИ!!!
        double[] doubles2 = doubles1;

        // КОПИРОВАНИЕ СОДЕРЖИМОГО МАССИВА doubles1 В doubles3
        double[] doubles3 = new double[4];
        doubles3[0] = doubles1[0];
        doubles3[1] = doubles1[1];
        doubles3[2] = doubles1[2];
        doubles3[3] = doubles1[3];

    }
}

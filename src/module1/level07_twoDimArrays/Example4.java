package module1.level07_twoDimArrays;

public class Example4 {
    public static void main(String[] args) {

        int[][] months = {
                {101, 102},
                {201, 202, 203},
                {301, 302, 303, 304, 306},
                {401}
        };

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.println(months[i][j] + " ");
            }
        }

        int[][] ints = new int[5][];
        ints[0] = new int[4];
        ints[1] = new int[1];
        ints[2] = new int[2];
        ints[3] = new int[3];
        ints[4] = new int[10];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j] + " ");
            }
        }
    }
}

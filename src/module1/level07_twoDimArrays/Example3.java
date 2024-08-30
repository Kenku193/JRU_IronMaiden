package module1.level07_twoDimArrays;

public class Example3 {
    public static void main(String[] args) {

        int[][] months = {
                            {101, 102, 103},
                            {201, 202, 203},
                            {301, 302, 303},
                            {401, 402, 403}
                         };

        System.out.println(months[1][2]);
        System.out.println("-".repeat(100));

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.println(months[i][j] + " ");
            }
        }

        System.out.println(months.length);
        System.out.println(months[0].length);

    }
}

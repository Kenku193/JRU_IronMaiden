package module2.level_07_casting.example2;

public class App {
    public static void main(String[] args) {

        int numMonth = 7;

//        switch (numMonth) {
//            case 1:
//                System.out.println("Winter");
//                break;
//            case 4:
//                System.out.println("Spring");
//                break;
//            case 7:
//                System.out.println("Summer");
//                break;
//            case 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Incorrect data");
//        }

        // yield
        //  Month vacation = new WinterMonth();
       Month vacation = switch (numMonth){
            case 12, 1, 2 -> {
                System.out.println("Отпуск зимой");
                yield new WinterMonth();
            }
            case 3, 4, 5 -> {
                System.out.println("Отпуск весной");
                yield new SpringMonth();
            }
            case 6, 7, 8 -> {
                System.out.println("Отпуск летом");
                yield new SummerMonth();
            }

            case 9, 10, 11 -> {
                System.out.println("Отпуск осенью");
                yield new AutumnMonth();
            }
            default -> new Month();

            // return что там в итоге совпало

        };

        System.out.println(vacation);

       // vacation.getClass();

//        if (vacation instanceof SummerMonth) {
//            ((SummerMonth) vacation).swim();
//        }

        if (vacation instanceof SummerMonth m) {
            m.swim();
        }

    }
}

package module1.level19_singletoneSwitchEnum.switchExample;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String value = console.nextLine();

        switch (value) {
            case "Один":
                System.out.println(1);
                break;
            case "Два":
                System.out.println(2);
                break;
            case "Десять":
                System.out.println(10);
                break;
            default:
                System.out.println("Совпадения на произошло");
        }

    }
}


package module1.level03_ifs;

public class Example8 {
    public static void main(String[] args) {

        int temp = -10;
        boolean isSun = true;
        int x = 98;

        if ((temp > 0) && (isSun == true) || (x==99) )
        {
            System.out.println("Ура, идем гулять!");
        }

        if ((temp > 0) || (isSun)) // ИЛИ
        {
            System.out.println("Ура, идем гулять!");
        }

    }
}

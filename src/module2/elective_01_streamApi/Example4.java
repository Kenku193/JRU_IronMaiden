package module2.elective_01_streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example4 {
    public static void main(String[] args) {

        ArrayList<Car> garage = new ArrayList<>();
        garage.add(new module2.elective_01_streamApi.Car("Toyota", "Silver"));
        garage.add(new module2.elective_01_streamApi.Car("BMW", "White"));
        garage.add(new module2.elective_01_streamApi.Car("VW", "Silver"));
        garage.add(new module2.elective_01_streamApi.Car("Ferrari", "Red"));
        garage.add(new module2.elective_01_streamApi.Car("Lada", "Black"));
        garage.add(new module2.elective_01_streamApi.Car("Tesla", "Green"));

//        List<String> carColors = garage
//                .stream()
//                .map(new Function<Car, String>() {
//                    @Override
//                    public String apply(Car car) {
//                        return car.getColor();
//                    }
//                })
//                .distinct()
//                .toList();

        List<String> carColors = garage
                .stream()
                .map(car -> car.getColor())
                .distinct()
                .toList();

        System.out.println(carColors);

        System.out.println("-".repeat(100));

        long count = garage.stream().map(c -> c.getColor()).distinct().count();
        System.out.println(count);

        System.out.println("-".repeat(100));

        boolean tesla = garage.stream().anyMatch(car -> car.brandName.equals("Lancia"));
        System.out.println(tesla);


    }
}

package module1.level19_singletoneSwitchEnum.enumeration;

public class App {
    public static void main(String[] args) {

        Days day = Days.SUNDAY;
        System.out.println(day);

        int ordinal = day.ordinal();
        System.out.println(ordinal);

        String name = Days.SUNDAY.name();
        System.out.println(name);

        String s = Days.SUNDAY.name().toString();
        System.out.println(s);

        System.out.println("-".repeat(100));

        Days d = Days.FRIDAY;
        String sName = Days.SUNDAY.toString();
        String sName1 = Days.SUNDAY.name();

        Days[] values = Days.values();
        for (Days value : values) {
            System.out.println(value);
        }
        System.out.println("-".repeat(100));
        System.out.println(values[2]);

        System.out.println("-".repeat(100));
        Days dayMonday = Days.valueOf("MONDAY");
        System.out.println(dayMonday);

        System.out.println("-".repeat(100));
        Days d1 = Days.MONDAY;
        Days d2 = Days.MONDAY;

        System.out.println(d1 == d2);

        boolean isEqualsToItself = Days.WEDNESDAY.equals(Days.WEDNESDAY);
        boolean isEqualsToDifferent = Days.WEDNESDAY.equals(Days.TUESDAY);

        System.out.println(isEqualsToItself);
        System.out.println(isEqualsToDifferent);

        int hashCodeFriday = Days.FRIDAY.hashCode();
        System.out.println(hashCodeFriday);

        System.out.println("-".repeat(100));
        int compare = Days.MONDAY.compareTo(Days.FRIDAY);
        System.out.println(compare);

    }
}

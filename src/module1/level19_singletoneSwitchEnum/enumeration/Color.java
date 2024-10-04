package module1.level19_singletoneSwitchEnum.enumeration;

public enum Color {
    GREEN,
    GREY,
    WHITE,
    SILVER,
    GOLD,
    PINK;

    public static Color[] getBrightColors(){
        Color[] brightColors = {GREEN, GOLD};
        return brightColors;
    }

    public static Color[] getBlankColors(){
        Color[] blankColors = {GREY, WHITE, SILVER};
        return blankColors;
    }
}

class RadioFeature {
    static String brand;
    static double frequencyRange;
    static boolean isPortable;
    static int volumeLevel;
    static boolean isOn;

    public static String getbrand() {
        brand = "Sony";
        return brand;
    }

    public static double getfrequencyRange() {
        frequencyRange = 87.5;
        return frequencyRange;
    }

    public static boolean getisPortable() {
        isPortable = true;
        return isPortable;
    }

    public static int getvolumeLevel() {
        volumeLevel = 5;
        return volumeLevel;
    }

    public static boolean getisOn() {
        isOn = true;
        return isOn;
    }
}

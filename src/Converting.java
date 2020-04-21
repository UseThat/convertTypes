public class Converting {
    public static void main(String[] args) {
        ConvertMeters convert = new ConvertMeters();
        double meter = 44.555;
        System.out.println("Meters to Centimeters "+convert.convertMetersToCenters(meter));
        System.out.println("Meter to Millimeters "+convert.convertMetersToMillimeters(meter));
        ConvertTime conver2 = new ConvertTime();
        int hour = 1;
        System.out.println(conver2.hoursToMinutes(hour));
        System.out.println(conver2.minutesToSeconds(conver2.hoursToMinutes(hour)));
        System.out.println(conver2.secondsToMillisenconds(conver2.minutesToSeconds(conver2.hoursToMinutes(hour))));

    }
}

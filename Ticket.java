public class Ticket {
    static String[] spaceLines = { "SpaceX", "Space Adventures", "Virgin Galactic" };
    static String[] tripTypes = { "One Way", "Round Trip" };
    static int kilometersToMars = 62100000;
    static int minSpeed = 16;
    static int maxSpeed = 30;
    static int minPrice = 36;
    static int maxPrice = 50;
    static int secondsPerDay = 24 * 60 * 60;
    static String lineFormat = "%-16s %4s %12s %6s\n";

    public static String randomSpaceline() {
        return Util.choice(spaceLines);
    }

    public static String randomTripType() {
        return Util.choice(tripTypes);
    }

    public static int randSpeed() {
        return Util.randint(minSpeed, maxSpeed + 1);
    }

    public static int tripPrice(int price, String tripType) {
        if (tripType.equals("Round Trip")) {
            return price * 2;
        }
        return price;
    }

    public static String generateTicket() {
        int speed = randSpeed();
        int days = (kilometersToMars / (speed * secondsPerDay));
        String spaceLine = randomSpaceline();
        String tripType = randomTripType();
        String price = "$ " + Integer.toString(tripPrice(speed + 20, tripType));

        return String.format(lineFormat, spaceLine, days, tripType, price);
    }

}
public class Ticket {
    static String[] spaceLines = { "SpaceX", "Space Adventures", "Virgin Galactic" };
    static String[] tripTypes = { "One Way", "Round Trip" };
    static int kilometersToMars = 62100000;
    static int minSpeed = 16;
    static int maxSpeed = 30;
    static int minPrice = 36;
    static int maxPrice = 50;
    static int secondsPerDay = 24 * 60 * 60;

    public static String randomSpaceline() {
        return Util.choice(spaceLines);
    }

    public static String randomTripType() {
        return Util.choice(tripTypes);
    }

    public static int randSpeed() {
        return Util.randint(minSpeed, maxSpeed + 1);
    }

    public static String generateTicket() {
        int speed = randSpeed();
        int days = kilometersToMars / (speed * secondsPerDay);
        int price = speed + 20;

        return "ticket";
    }

}
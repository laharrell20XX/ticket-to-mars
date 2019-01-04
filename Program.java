import java.util.Random;

public class Program {
    public static void main(String[] args) {
        System.out.printf("%-16s %4s %12s %6s\n", "Spaceline", "Days", "Trip type", "Price");
        System.out.println("=========================================");
        for (int i = 0; i < 10; i++) {
            System.out.print(Ticket.generateTicket());
        }
    }
}
// public static void getRandomWord(){
// Random rand = new Random();
// String randomWord = words.get(rand.nextInt(words.size));
// }
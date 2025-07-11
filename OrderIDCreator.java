import java.util.Random;

public class OrderIDCreator {
    public static void main(String[] args) {
        // Create a Random object for generating random values
        Random random = new Random();

        // Create an array to hold 5 order IDs
        String[] orderIDs = new String[5];

        // Loop 5 times to generate each Order ID
        for (int i = 0; i < orderIDs.length; i++) {
            // Generate a random uppercase letter between 'A' and 'E'
            char prefix = (char) (random.nextInt(5) + 'A'); // 'A' is ASCII 65

            // Generate a number between 1 and 999
            int number = random.nextInt(999) + 1;

            // Format the number with leading zeros to ensure it’s always 3 digits
            String suffix = String.format("%03d", number);

            // Combine the prefix and suffix to get the Order ID
            orderIDs[i] = prefix + suffix;
        }

        // Print all generated Order IDs
        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}

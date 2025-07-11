import java.util.Random;
import java.util.Scanner;

class DiceAndExercise {

    public static void main(String[] args) {
        // Dice if else
        Random dice = new Random();
        int roll1 = dice.nextInt(6) + 1; // Generates a random number between 1 and 6
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        if ((roll1 == roll2) && (roll2 == roll3)) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        } else if ((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3)) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }

        // Exercise: If else
        Random random = new Random();
        int daysUntilExpiration = random.nextInt(12); // Generates a random number between 0 and 11
        int discountPercentage = 0;

        if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        } else if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
        }

        if (daysUntilExpiration < 0) { // Changed to < 0 to be logically correct
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 0) { //changed from 1 to 0 to match logic
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        } else {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
        }
    }
}

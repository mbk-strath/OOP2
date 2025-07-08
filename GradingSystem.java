import java.util.Scanner;

class GradingSystem {
    public static void main(String[] args) {
        GradingSystem obj = new GradingSystem();  // Create an object of GradingSystem
        obj.getGrade();  // Call the getGrade method
    }
    Scanner scanner = new Scanner(System.in);

    public void getGrade(){
        float scores;
        String grade;

        System.out.println("Enter Your Test Scores: ");
        scores = scanner.nextFloat();

        while (scores > 100 || scores < 0) {
            System.out.println("Invalid Entry. Scores can only be between 0 and 100.");
            System.out.println();
            System.out.println("Enter Your Test Scores: ");
            scores = scanner.nextFloat();
        }

        if (scores >= 70) {
            grade = "A";
            System.out.println("Your Grade: " + grade);
        } else if (scores >= 60 ) {
            grade = "B";
            System.out.println("Your Grade: " + grade);
        } else if (scores >= 50 ) {
            grade = "C";
            System.out.println("Your Grade: " + grade);
        } else if (scores >= 40 ) {
            grade = "D";
            System.out.println("Your Grade: " + grade);
        } else {
            grade = "E";
            System.out.println("Your Grade: " + grade);
        }
    }
}
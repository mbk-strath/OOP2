import java.util.Scanner;

class InputExample {
    public void readNameAndAge() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age; // in years
        System.out.print("Name? ");
        name = scanner.next();
        System.out.print("Age? ");
        age = scanner.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " springs young");
        scanner.close(); // It's good practice to close the scanner when you're done with it.
    }

    public static void main(String[] args) {
        (new InputExample()).readNameAndAge();
    }
}

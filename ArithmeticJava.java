import java.io.*;

class ArithmeticJava {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 0;

        int answer = number1 / number2; // This line will cause an ArithmeticException

        System.out.println("Answer: " + answer);
    }
}
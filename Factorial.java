public class Factorial {
    public static int factorial(int num){
        if(num > 1){
            return num * factorial(num-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + factorial(num));
    }
}
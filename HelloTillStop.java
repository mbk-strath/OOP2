import java.util.*;
class HelloTillStop {
    public static void main(String[] args) {
        HelloTillStop obj = new HelloTillStop();
        obj.showHello();
    }
    Scanner sc = new Scanner(System.in);
         public void showHello() {
            String choice; //guard variable

            System.out.println("For Hello type h, anything else to stop");
            choice = sc.next();
            while ("h".equals(choice)) {
                System.out.println("Hello");
                choice = sc.next();
            }
        }

}

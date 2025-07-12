public class RecursiveSum {
    public static int recSum(int num){
        if(num > 1){
            return num + recSum(num-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println("Sum: " + recSum(num));
    }
}
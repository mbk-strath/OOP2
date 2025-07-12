public class Arithmetic {
    public static void main(String[] args){
        int firstNo = 100;
        int secondNo = 0;
        int answer;
        try{
            answer = firstNo / secondNo;
            System.out.println("Answer: " + answer);
        } catch(Exception e){
            System.out.println("Error: Division by zero not allowed");
        } finally {
            System.out.println("The program has continued");
        }
    }
}
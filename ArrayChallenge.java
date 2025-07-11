public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"A567","B141","E222","C785","B145","D344","C786","E982",};

        for(String orderId : orderIds){
            if(orderId.startsWith("B")){
                System.out.println(orderId);
            }
        }
    }
}
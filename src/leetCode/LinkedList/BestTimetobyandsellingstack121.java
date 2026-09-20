package leetCode.LinkedList;

public class BestTimetobyandsellingstack121 {
    static int Maximunprofit(int[] prices){
        int buy_price=prices[0];
        int maximum_profit=0;
        for(int i=0;i<prices.length;i++){
            int current_profit=prices[i]-buy_price;
            if(current_profit>maximum_profit){
                maximum_profit=current_profit;
            }
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
        }
        return maximum_profit;
    }
    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println( Maximunprofit(prices));
    }
}

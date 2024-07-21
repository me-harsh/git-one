import java.lang.Math;
public class array9 {

    public static int buyandsellStocks(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            int sellPrice=price[i];
            if(buyPrice<sellPrice){
                int profit=sellPrice-buyPrice;//today's profit
                maxProfit=Math.max(maxProfit,profit);
            }else buyPrice=sellPrice;
        }
        return maxProfit;
    }
    // 2nd method
    public static int stocks(int price[]) {
        int buyP = Integer.MAX_VALUE;
        int profit =0;
        for (int i = 0; i < price.length; i++) {
            buyP = Math.min(price[i], buyP);
            profit = Math.max(profit,buyP-price[i]);
        }
        
        return profit;
    }
    public static void main(String args[]){
        int prices[]={7,8,1,3,5,6};
        System.out.println(buyandsellStocks(prices));
        
    }

    
    
    
    
}

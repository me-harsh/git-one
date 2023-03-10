public class array9 {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandsellStocks(prices));
        
    }

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
    
}

package InterviewQuestions;

public class Stocks {
   public static void main(String[] args) {

      int[] stockPricesYesterday = new int[]{10, 7, 9, 77, 44};

      getMaxProfit(stockPricesYesterday);
   }

   private static void getMaxProfit(int[] stockPricesYesterday) {
      int minPrice = Integer.MAX_VALUE;
      int minPriceTime = 0;
      int maxPrice = 0;
      for (int i = 0; i < stockPricesYesterday.length; i++) {
         if (stockPricesYesterday[i] < minPrice) {
            minPrice = stockPricesYesterday[i];
            minPriceTime = i;
         }
         if (stockPricesYesterday[i] > maxPrice) {
            if (minPriceTime < i) {
               maxPrice = stockPricesYesterday[i];
            }
         }
      }
      int value = maxPrice - minPrice;
      if (value > 0) {
         System.out.println(value);
      } else {
         System.out.println("Value goes down");
      }
   }
}

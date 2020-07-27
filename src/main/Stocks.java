package main;

public class Stocks {

    public static void main(String[] args) {
        double stockPrices[] = {10, 7, 5, 8, 11, 9};
        System.out.print(getMaxProfit(stockPrices));
    }

    public static double getMaxProfit(double stockPrices[]) {
        double profit = -1;
        double purchasePrice = 0;
        double salePrice = 0;
        boolean movePurchaseIndex = true;

        if (stockPrices.length < 2) {
            return 0;
        }

        for (int i=0; i<stockPrices.length-1; i++) {
            salePrice = stockPrices[i+1];
            if (movePurchaseIndex) {
                purchasePrice = stockPrices[i];
            }
            if (salePrice < purchasePrice) {
                movePurchaseIndex = true;
            } else {
                double tempProfit = salePrice - purchasePrice;
                if (tempProfit > profit) {
                    profit = tempProfit;
                }
                movePurchaseIndex = false;
            }
        }

        return profit;
    }
}

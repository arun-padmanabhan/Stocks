package test;

import main.Stocks;
import org.testng.annotations.Test;
import org.testng.Assert;

public class StocksTest {

    @Test
    public void stockPricesNormalScenario() {
        double stockPrices[] = {10, 7, 5, 8, 11, 9};
        final double expected = 6;
        final double actual = Stocks.getMaxProfit(stockPrices);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stockPricesWithTwoIndicesNoProfit() {
        double stockPrices[] = {11,2};
        final double expected = -1;
        final double actual = Stocks.getMaxProfit(stockPrices);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stockPricesWithOneIndex() {
        double stockPrices[] = {2};
        final double expected = 0;
        final double actual = Stocks.getMaxProfit(stockPrices);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stockPricesWitMaxIndexes() {
        double stockPrices[] = new double[1440];
        for (int i=0; i<1440; i++) {
            stockPrices[i] = i*10;
        }
        final double expected = 14390;
        final double actual = Stocks.getMaxProfit(stockPrices);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stockPricesWithFallingValues() {
        double stockPrices[] = {10, 9, 6, 4, 2, 1};
        final double expected = -1;
        final double actual = Stocks.getMaxProfit(stockPrices);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stockPricesWithIncreasingValues() {
        double stockPrices[] = {10, 12, 15,18, 21, 24};
        final double expected = 14;
        final double actual = Stocks.getMaxProfit(stockPrices);
        Assert.assertEquals(actual, expected);
    }
}

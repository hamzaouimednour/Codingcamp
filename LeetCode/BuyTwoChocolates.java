class Solution {
    public int buyChoco(int[] prices, int money) {
        int leftover = money;
        int bought = 0;

        // sort prices
        Arrays.sort(prices);
        
        for (int price : prices) {
            if(price > leftover || bought == 2) break;
            leftover -= price;
            bought++;
        }
        return bought != 2 ? money : leftover;
    }
}

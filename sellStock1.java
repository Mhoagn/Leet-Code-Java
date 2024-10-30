import java.util.Scanner;
import java.math.*;

public class sellStock1 {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i = 1; i < n; i++) {
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number of element: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Input your element");
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        sellStock1 s1 = new sellStock1();
        int res = s1.maxProfit(prices);

        System.out.print("Maximum profit in single day: " + res);

    }
}

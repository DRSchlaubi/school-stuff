
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiRi217740
 */
public class CheckoutUtil {
    
    /**
     * Calculates the lowest possible change for the price.
     * @param price the price of the actual item
     * @param given the money given by the customer
     * @return a {@link Change} object containing the lowest possible change
     */
    public static Change calculateChange(double price, double given) {
        List<Money> coins = Arrays.asList(Money.values());
        Map<Money, Integer> coinMap = new HashMap<>();
        Collections.reverse(coins); // We need to start from highest to lowest to get the least possible amount of coins
        double changeNeeded = (given - price);
        for(Money money : coins) {
            if (changeNeeded == 0) {
                break;
            }
            double exactAmount = changeNeeded / money.getValue();
            int amount = (int) exactAmount;
            coinMap.put(money, amount);
            changeNeeded = Math.round((changeNeeded - money.sum(amount)) * 100.0) / 100.0; // this method is shit but I don't want to figure out a new one
        }
       return new Change(coinMap);
    }
    
}

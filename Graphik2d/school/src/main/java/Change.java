
import java.text.DecimalFormat;
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
public class Change {

    private static final DecimalFormat FORMAT = new DecimalFormat("#0.00");
    
    // Money -> count
    private final Map<Money, Integer> coins;
    
    public Change(Map<Money, Integer> coins) {
        this.coins = coins;
    }

    /**
     * Retrieves the amount of coins of a specific {@link Money} type.
     * @param money the {@link Money} type of the coin
     * @return the amount of coins
     */
    int getAmountOfCoin(Money money) {
        return coins.getOrDefault(money, 0);
    }
    
    /**
     * Calculates the sum of all coins
     * @return the sum of all coins
     */
    double sum() {
        return coins.entrySet()
                .stream()
                .mapToDouble((money) -> money.getKey().sum(money.getValue()))
                .sum();
    }
    
    /**
     * Checks whether this change is empty or not.
     * @return whether this chjange is empyt or not
     */
    boolean isEmpty() {
        return coins.isEmpty();
    }
    
    /**
     * Builds a summary of this change.
     * @return the summer as a string
     */
    String buildSummary() {
        StringBuilder builder = new StringBuilder();
        
        for(Money money : Money.values()) {
            int amount = getAmountOfCoin(money);
            if(amount == 0) continue;
            builder.append(FORMAT.format(money.getValue()))
                    .append('€')
                    .append(" x ")
                    .append(amount)
                    .append(" = ")
                    .append(FORMAT.format(money.sum(amount)))
                    .append('€')
                    .append(System.lineSeparator());
        }
        
        builder.append(System.lineSeparator()).append("Summe: ").append(FORMAT.format(sum())).append('€');
        
        return builder.toString();
    }
}

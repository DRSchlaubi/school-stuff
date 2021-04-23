
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MiRi217740
 */
public enum Money {
    ONE_CENT(.01),
    TWO_CENT(.02),
    FIVE_CENT(.05),
    TEN_CENT(.1),
    TWENTY_CENT(.2),
    FIFTY_CENT(.5),
    ONE_EURO(1),
    TWO_EURO(2);

    private final double value;

    Money(double value) {
        this.value = value;
    }

    /**
     * Calculates the sum of the speciefied amount of coins.
     *
     * @param amount the amount of coins
     * @return the sum
     */
    double sum(int amount) {
        return value * amount;
    }

    /**
     * Returns the value of the coin in euros.
     *
     * @return the value
     */
    double getValue() {
        return value;
    }

    /**
     * Finds the {@link Money} object for the specified value.
     *
     * @param value the value
     * @throws IllegalArgumentException when there is no money found for that
     * value
     * @return the {@link Money}
     */
    static Money forValue(double value) {
        return Arrays.stream(values())
                .filter(it -> it.getValue() == value)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No money found for that value"));
    }
}

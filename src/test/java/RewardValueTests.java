import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.0001);
    }

    @Test
    public void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    public void convert_from_cash_to_miles() {
        double cashValue = 100;
        int excpectedMiles = (int)(cashValue / RewardValue.MILES_TO_CASH);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(excpectedMiles, rewardValue.getMilesValue());
    }

    @Test
    public void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = (double)milesValue * RewardValue.MILES_TO_CASH;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001);
    }
}

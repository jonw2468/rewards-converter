public class RewardValue {
    private final double cash_value;
    static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cash_value = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cash_value = (double)milesValue * MILES_TO_CASH;
    }

    public double getCashValue() {
        return cash_value;
    }

    public int getMilesValue() {
        return (int)(cash_value / MILES_TO_CASH);
    }
}
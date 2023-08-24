public class RewardValue {
    private int miles;
    private double cash_value;
    static double rate = 0.0035;

    protected RewardValue(double cashValue) {
        this.cash_value = cashValue;
        this.miles = (int) (cash_value / rate);
    }

    protected double getMilesValue() {
        return this.miles;
    }
}

public class CreditPaymentService {
    public int calculate(int amount, int years, float percent) {
        float i = percent / 12 / 100;
        return (int) (amount * (i + i / (Math.pow(1 + i, 12 * years) - 1)));
    }
}

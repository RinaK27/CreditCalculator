public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int firstVersion = service.calculate(1_000_000, 1, 9.99F);
        int secondVersion = service.calculate(1_000_000, 2, 9.99F);
        int thirdVersion = service.calculate(1_000_000, 3, 9.99F);
        System.out.println("Месячный платеж составит:" + firstVersion);
        System.out.println("Месячный платеж составит:" + secondVersion);
        System.out.println("Месячный платеж составит:" + thirdVersion);
    }
}

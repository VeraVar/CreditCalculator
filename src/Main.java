public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();

        long payment1 = service.calculate(1_000_000, 12);
        System.out.println(payment1);

        long payment2 = service.calculate(1_000_000, 24);
        System.out.println(payment2);

        long payment3 = service.calculate(1_000_000, 36);
        System.out.println(payment3);
        }
}

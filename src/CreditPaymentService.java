public class CreditPaymentService {
    public long calculate (long creditAmount, long creditPeriodInMonths) {
            double rateOnYear = 0.0999;
            double rateOnMonth = rateOnYear / 12;

            double index = rateOnMonth * (Math.pow(1 + rateOnMonth, creditPeriodInMonths) / (Math.pow(1 + rateOnMonth, creditPeriodInMonths) - 1));

            long payment = (long) (creditAmount * index);

            return payment;
        }
    }

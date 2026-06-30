public class StrategyPatternTest {

    public static void main(String[] args) {

        // Using Credit Card Payment
        PaymentContext paymentContext =
                new PaymentContext(new CreditCardPayment());

        paymentContext.executePayment(2500.00);

        // Switching to PayPal Payment
        paymentContext.setPaymentStrategy(new PayPalPayment());

        paymentContext.executePayment(1500.50);
    }
}
package aula22_10;

public class PayPalAdapter implements Pagamento {

    private PayPalAPI paypal = new PayPalAPI();

        @Override
        public void pagar() {

            paypal.sendPayment();

        }
    }


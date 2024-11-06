
class PaymentCard extends Payment {

    public PaymentCard(int id, String paymentType) {
        super(id, paymentType);
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing payment with Card");
        return true;
    }
}


class PaymentPix extends Payment {

    public PaymentPix(int id, String paymentType) {
        super(id, paymentType);
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing payment with Pix");
        return true;
    }
}


abstract class Payment implements PaymentInterface {

    private int id;
    private String paymentType;

    public Payment(int id, String paymentType) {
        this.id = id;
        this.paymentType = paymentType;
    }

    public int getId() {
        return id;
    }

    public String getPaymentType() {
        return paymentType;
    }
}

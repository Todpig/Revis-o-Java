
import java.util.ArrayList;

class Main {

    public static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<Payment> payments = new ArrayList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void addPayment(Payment payment) {
        payments.add(payment);
    }

    public static void initializeData() {
        Product product1 = new Eletronic(1, "Product 1", 100);
        Product product2 = new Eletronic(2, "Product 2", 200);
        Product product3 = new Eletronic(3, "Product 3", 300);
        Product product4 = new LockerRoom(4, "Product 4", 400);
        Product product5 = new LockerRoom(5, "Product 5", 500);

        Payment payment1 = new PaymentCard(1, "card");
        Payment payment2 = new PaymentCard(2, "card");
        Payment payment3 = new PaymentPix(3, "pix");
        Payment payment4 = new PaymentPix(4, "pix");

        addPayment(payment1);
        addPayment(payment2);
        addPayment(payment3);
        addPayment(payment4);

        addProduct(product1);
        addProduct(product2);
        addProduct(product3);
        addProduct(product4);
        addProduct(product5);

    }

    public static void main(String[] args) {
        initializeData();

        for (Payment payment : payments) {
            System.out.println(payment.processPayment());
        }
    }
}

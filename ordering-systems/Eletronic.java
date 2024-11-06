
class Eletronic extends Product {

    public Eletronic(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return super.price * 0.1;
    }

}


class LockerRoom extends Product {

    public LockerRoom(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return super.price * 0.2;
    }

}

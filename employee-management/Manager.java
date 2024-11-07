
class Manager extends Employee implements Bonus {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return calculateBonus(0.1);
    }

    @Override
    public double calculateBonus(double percent) {
        double salary = getSalary();
        double bonus = salary * percent;
        return salary + bonus;
    }
}

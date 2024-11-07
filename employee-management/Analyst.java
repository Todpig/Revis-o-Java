
class Analyst extends Employee implements Bonus {

    public Analyst(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return calculateBonus(0.05);
    }

    @Override
    public double calculateBonus(double percent) {
        double salary = getSalary();
        double bonus = salary * percent;
        return salary + bonus;
    }
}

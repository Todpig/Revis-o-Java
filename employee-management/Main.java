// No m ́etodo main, adicione alguns funcion ́arios `a Empresa e im-
// prima seus sal ́arios calculados com o bˆonus.

class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(1, "John", 1000);
        Employee analyst = new Analyst(2, "Jane", 500);
        Enterprise<Employee> enterprise = new Enterprise<>();
        enterprise.addEmployee(manager);
        enterprise.addEmployee(analyst);
        enterprise.displayEmployees();
    }
}

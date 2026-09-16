class Employee {
    String name;
    double salary, bonus;

    Employee(String n, double s, double b) {
        name = n;
        salary = s;
        bonus = b;
    }

    double calculateSalary() {
        return salary + bonus;
    }

    void displaySalary() {
        System.out.println(name + " Total Salary: " + calculateSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 30000, 5000);
        Employee e2 = new Employee("Amit", 40000, 8000);

        e1.displaySalary();
        e2.displaySalary();
    }
}
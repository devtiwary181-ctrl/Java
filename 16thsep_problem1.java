class Employee {
    String name;
    double salary;
    double bonus;

    double calculateSalary() {
        return salary + bonus;
    }
    void displaySalary() {
        System.out.println("Employee's Name: " + name);
        System.out.println("Total Salary of the employee: " + calculateSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "kutta";
        e1.salary = 30000;
        e1.bonus = 5000;

        Employee e2 = new Employee();
        e2.name = "Billi";
        e2.salary = 40000;
        e2.bonus = 8000;

        e1.displaySalary();
        e2.displaySalary();
    }
}
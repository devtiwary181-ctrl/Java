
class Student {
    String name;
    String usn;
    int marks1, marks2, marks3;

    Student(String name, String usn, int marks1, int marks2, int marks3) {
        this.name = name;
        this.usn = usn;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dev", "4NI25CS061", 85, 90, 88);
        s1.displayDetails();
    }
}


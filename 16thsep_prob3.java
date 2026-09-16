class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        length = 20;
        breadth = 5;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.display();
        Rectangle r2 = new Rectangle(20, 10);
        r2.display();
    }
}


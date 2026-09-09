```java
class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(8, 4);

        System.out.println("Area of Rectangle 1: " + r1.area());
        System.out.println("Area of Rectangle 2: " + r2.area());
    }
}
```

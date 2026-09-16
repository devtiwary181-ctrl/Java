
class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // Base condition
        }

        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}
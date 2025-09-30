package msu;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("2 + 3 = " + app.add(2, 3));
        System.out.println("4 * 5 = " + app.multiply(4, 5));
    }
}

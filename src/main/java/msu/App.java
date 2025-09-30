package msu;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public String greet() {
        return "Hello Jenkins";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Sum: " + app.add(2, 3));
        System.out.println(app.greet());
    }
}

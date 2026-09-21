public class typecasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit typecasting
        System.out.println("Implicit Typecasting: " + b);

        double c = 9.78;
        int d = (int) c; // Explicit typecasting
        System.out.println("Explicit Typecasting: " + d);
    }
}

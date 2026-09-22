public class methods {
    static void display(){
        System.out.println("This is a static method.");
    }
    static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }
    static int add(int a, int b){
        return a + b;
    }
    static String display1(){
        return "hello";
    }
    public static void main(String[] args) {
        display();
        greet("Alice");
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println(display1());}
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 4));
        System.out.println(calc.subtract(10, 5));
        System.out.println(calc.multiply(11, 11));
        System.out.println(calc.divide(5, 0));
    }
}
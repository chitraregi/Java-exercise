public class BiNumber {
    private int number1, number2;

    // constructor
    BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // methods
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int add() {
        return number1 + number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    // main
    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());

        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());
    }
}

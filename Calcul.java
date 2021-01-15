import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1:");
        int Number1 = scanner.nextInt();
        System.out.println("The number you entered is " + Number1);
        System.out.print("Enter Number2:");
        int Number2 = scanner.nextInt();
        System.out.println("The number you entered is " + Number2);
        System.out.println("the operations are:");
        System.out.println("1-Add");
        System.out.println("2-Sub");
        System.out.println("3-mul");
        System.out.println("4-div");
        System.out.print("Enter operation:");
        int operation = scanner.nextInt();
        if (operation == 1) {
            int add;
            add = Number1 + Number2;
            System.out.println(" Result\t  " + add);
        } else if (operation == 2) {
            int sub;
            sub = Number1 - Number2;
            System.out.println(" Result\t " + sub);
        } else if (operation == 3) {
            int mul;
            mul = Number1 * Number2;
            System.out.println(" Result\t  " + mul);
        } else if (operation == 4) {
            int div;
            div = Number1 / Number2;
            System.out.println(" Result\t " + div);
        } else {
            System.out.println("Invalid operation");

        }
    }
}

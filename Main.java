import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your mode (1, 2, 3, 4, 5, 6, 7):\n1) + Addition\n2) - Subtraction\n3) * Multiplication\n4) / Division\n5) ** Exponent\n6) ABS Absolute Value\n7) o Rounding");
        choice = scanner.nextInt();

        if (choice == 1) {
            int a, b;


            System.out.println("Please enter a number: ");
            a = scanner.nextInt();
            System.out.println("Please enter another number: ");
            b = scanner.nextInt();

            System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + (a + b));
        } else if (choice == 2) {
            int a, b;


            System.out.println("Please enter a number: ");
            a = scanner.nextInt();
            System.out.println("Please enter another number: ");
            b = scanner.nextInt();

            System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + (a - b));
        } else if (choice == 3) {
            int a, b;


            System.out.println("Please enter a number: ");
            a = scanner.nextInt();
            System.out.println("Please enter another number: ");
            b = scanner.nextInt();

            System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + (a * b));
        } else if (choice == 4) {
            int a, b;


            System.out.println("Please enter a number: ");
            a = scanner.nextInt();
            System.out.println("Please enter another number: ");
            b = scanner.nextInt();

            System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + (a / b));
            System.out.println("Remainder: " + (a % b));
        } else if (choice == 5) {
            int a, b;

            System.out.println("Please enter a number: ");
            a = scanner.nextInt();
            System.out.println("Please enter the exponent for the number: ");
            b = scanner.nextInt();

            System.out.println("The square of " + a + " is equal to " + (Math.pow(a,b)));
        } else if (choice == 6) {
            int a;

            System.out.println("Please enter a number that you want the absolute value of: ");
            a = scanner.nextInt();
            System.out.println("The absolute value of " + a + " is " + (Math.abs(a)));

        } else if (choice == 7) {
            double a, b;

            System.out.println("Please enter the number you want to round: ");
            a = scanner.nextDouble();
            b = a + 0.5;
            System.out.println("Rounded version of " + a + " is " + Math.floor(b));
        } else {
            System.out.println("Please choose an actual mode!");
        }
        System.out.println("Press Enter to exit...");
        scanner.nextLine();
        scanner.nextLine();
        scanner.close();
    }
}
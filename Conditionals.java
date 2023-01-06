import java.util.Scanner;

class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation would you like to perform? ");
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.printf("%f + %f = %f\n", num1, num2, num1 + num2);
        } else if (operation.equals("-")) {
            System.out.printf("%f - %f = %f\n", num1, num2, num1 - num2);
        } else if (operation.equals("*")) {
            System.out.printf("%f * %f = %f\n", num1, num2, num1 * num2);
        } else if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.println("Cannot divide by 0!");
            } else {
                System.out.printf("%f / %f = %f\n", num1, num2, num1 / num2);
            }
        } else if (operation.equals("%")) {
            System.out.printf("%f modulo %f = %f\n", num1, num2, num1 % num2);
        }
        else {
            System.out.printf("%s is not supported\n", operation);
        }

        scanner.close();
    }
}
import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation would you like to perform? ");
        String operation = scanner.nextLine();

        switch(operation) {
            case "+":
                System.out.printf("%f + %f = %f\n", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%f - %f = %f\n", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%f * %f = %f\n", num1, num2, num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                        System.out.println("Cannot divide by 0!");
                    } else {
                        System.out.printf("%f / %f = %f\n", num1, num2, num1 / num2);
                    }
                    break;
            case "%":
                System.out.printf("%f modulo %f = %f\n", num1, num2, num1 % num2);
                break;
            default:
                System.out.printf("%s is not supported\n", operation);       
        }

        scanner.close();
    }
}
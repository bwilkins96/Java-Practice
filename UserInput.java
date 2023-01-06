import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("What is your name? " );
        String name = scanner.nextLine();

        System.out.printf("Hello %s, how old are you?\n", name);
        int age = scanner.nextInt();
        //int age = Integer.parseInt(scanner.nextLine()); // cleans up input error A

        // cleans up input buffer B
        scanner.nextLine();

        System.out.printf("%d is an excellent age to start programming!\n", age);
        String language = scanner.nextLine();

        System.out.printf("%s is a cool programming language!\n", language);

        scanner.close();
    }
}
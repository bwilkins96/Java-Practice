class Operators {
    public static void main(String[] args) {
        double num1 = 13;
        double num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        System.out.println("\n" + (num1 == num2));
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        num1++;
        num2--;

        System.out.println("\n" + (num1));
        System.out.println(num2);
        System.out.println(num1++);
        System.out.println(num1);
        System.out.println(++num1);
    }
}
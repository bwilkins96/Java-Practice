class Variables {
    static int age;
    public static void main(String[] args) {
        age = 26;

        System.out.println("I am " + age + " years old.");

        byte aByte = 100; // -128 to 127
        short aShort = 20000; // -32,768 to 32,767
        int aInt = 2147483647; // -2147483648 to 2147483647
        long aLong = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        double aDouble = 51.7913; // 4.9E-324 to 1.798E308
        float aFloat = 2.402F; // 1.4E-45 to 3.4E38
        
        boolean isWeekend = true;
        boolean isWorkday = false;

        char copyright = '\u00A9';
        char percentage = '%';

        System.out.println(copyright);

        double num1 = 5.8;
        int num2 = (int)num1;

        System.out.println(num2);
    }

}
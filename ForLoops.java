class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\n", i);
        }

        System.out.println();

        int nums[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println(nums[i]);
        }

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.printf("sum: %d\n\n",sum);

        int num = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }

        // multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
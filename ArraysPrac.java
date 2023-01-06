import java.util.Arrays;

class ArraysPrac {
    public static void main(String[] args) {

        // char vowels[] = new char[5];

        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        Arrays.sort(vowels); // Arrays.sort(arr, startingIdx, endingIdx);

        int oIdx = Arrays.binarySearch(vowels, 'o'); // (arr, sIdx, eIdx, key)
        int xIdx = Arrays.binarySearch(vowels, 'x');

        int nums[] = new int[10];
        Arrays.fill(nums, 5);
        int numsCopy[] = Arrays.copyOf(nums, nums.length); // can reduce or increase size

        System.out.println(Arrays.equals(nums, numsCopy));

        Arrays.fill(nums, 0);
        int numsRange[] = Arrays.copyOfRange(nums, 2, 4);

        System.out.println(vowels[2]);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
        System.out.println(oIdx);
        System.out.println(xIdx);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsCopy));
        System.out.println(Arrays.toString(numsRange));

    }
}
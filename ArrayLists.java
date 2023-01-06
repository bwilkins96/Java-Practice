import java.util.ArrayList;
import java.util.Comparator;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.toString());
        System.out.println(numbers.get(1));
        System.out.println(numbers.size());
        System.out.println(numbers.contains(Integer.valueOf(1)));
        System.out.println(numbers.contains(Integer.valueOf(75)) + "\n");


        numbers.forEach( num -> {
            //numbers.set(numbers.indexOf(num), num*2);
            numbers.set(num-1, num*2);
        });

        System.out.println(numbers.toString() + "\n");

        numbers.set(0, Integer.valueOf(50));
        numbers.remove(2);
        numbers.remove(Integer.valueOf(4));
        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString() + "\n");
        
        numbers.clear();

        System.out.println(numbers.toString()); 
        System.out.println(numbers.isEmpty());

    }
}
import java.util.HashSet;

public class storeIntergerQ6 {
    /*
    Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
     */
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();    // create Hashset object
        numbers.add(4);    // add value to set
        numbers.add(7);
        numbers.add(8);


        //numbers between 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + "was found in the set");

            } else {

                System.out.println(i + "was not found in the set");
            }

        }
    }
}



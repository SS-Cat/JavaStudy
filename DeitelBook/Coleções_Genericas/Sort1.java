import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Sort1
 */
public class Sort1 {

    public static void main(String[] args) {
        
        // String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        // List<String> list = Arrays.asList(suits);

        List<String> list = Arrays.asList(new String[]{
            "Hearts", "Diamonds", "Clubs", "Spades"
        });
        
        
        System.out.printf("Unsorted array elements: %s\n", list);

        Collections.sort(list);
        System.out.printf("Sorted array elements: %s\n", list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted array elements in reversed: %s\n", list);

    }
}
import java.util.ArrayList;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()) {
            return 0;
        }
        else {
            return L.get(0) + sum(L.subList(1,L.size()));
        }
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evenL = new ArrayList<>();
        for (int i: L) {
            if (i % 2 == 0) {
                evenL.add(i);
            }
        }
        return evenL;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commonL = new ArrayList<>();
        for (int i: L1) {
            if (L2.contains(i)) {
                commonL.add(i);
            }
        }
        return commonL;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int times = 0;
        for (String s: words) {
            for (char i: s.toCharArray()) {
                if (i == c) {
                    times++;
                }
            }
        }
        return times;
    }


}

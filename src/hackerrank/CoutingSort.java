package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoutingSort {

    public static List<Integer> countingSort(List<Integer> arr) {

        int max = Collections.max(arr);


        List<Integer> frequency = new ArrayList<>(Collections.nCopies(max + 1, 0));


        for (int num : arr) {
            frequency.set(num, frequency.get(num) + 1);
        }

        return frequency;
    }
}

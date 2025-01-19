package hackerrank;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        int sum = 0;
        int max = arr.size() -1 ;
        for(Integer x: arr) {
            sum += x;
        }

        Collections.sort(arr);
        System.out.printf("%d %d", sum - arr.get(max),sum - arr.get(0) );

    }
}

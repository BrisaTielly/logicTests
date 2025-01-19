package hackerrank;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        for (Integer x : arr) {
            sum += x;
        }
        Collections.sort(arr);
        long minSum = sum - arr.get(arr.size() - 1);
        long maxSum = sum - arr.get(0);
        System.out.printf("%d %d%n", minSum, maxSum);
    }
}

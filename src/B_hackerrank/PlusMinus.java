package B_hackerrank;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.io.*;

public class PlusMinus {

    public class Result {

        public static void plusMinus(List<Integer> arr) {
            int n = arr.size();
            long positives = arr.stream().filter(x -> x > 0).count();
            long negatives = arr.stream().filter(x -> x < 0).count();
            long neut = arr.stream().filter(x -> x == 0).count();
            System.out.printf("%.6f\n" ,(double) positives/n);
            System.out.printf("%.6f\n", (double)negatives/n);
            System.out.printf("%.6f\n", (double) neut/n);

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.plusMinus(arr);

            bufferedReader.close();
        }
    }

}

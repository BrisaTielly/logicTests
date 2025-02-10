package B_hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : strings){
            map.put(word, map.getOrDefault(word, 0)+1);

        }

        List<Integer> result = new ArrayList<>();
        for(String query : queries){
            result.add(map.getOrDefault(query, 0));
        }
        return result;

    }
}

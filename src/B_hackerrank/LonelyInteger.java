package B_hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> set = new HashSet<>();
        for(Integer num : a){
            if(set.contains(num)) {
                set.remove(num);
            }else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}

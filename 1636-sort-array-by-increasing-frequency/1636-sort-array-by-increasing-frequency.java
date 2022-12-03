import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Integer[] expected = new Integer[nums.length];
        int index = 0;
        for (int n : nums) {
            expected[index++] = n;
        }

        Arrays.sort(expected, (o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                return o2 - o1;
            }
            return map.get(o1).compareTo(map.get(o2));
        });
        
        return Arrays.stream(expected)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            boolean check = set.add(n);
            if (!check) {
                return true;
            }
        }
        return false;
    }
}
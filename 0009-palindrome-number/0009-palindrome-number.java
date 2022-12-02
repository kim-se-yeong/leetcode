class Solution {
    public boolean isPalindrome(int x) {
        
        String origin = String.valueOf(x);
        String reverse = new StringBuilder(origin).reverse().toString();
        return origin.equals(reverse);
    }
}
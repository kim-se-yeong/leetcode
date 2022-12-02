class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }
        
        int tmp = x;
        int reverse = 0;
        while (tmp != 0) {
            reverse = reverse * 10 + tmp % 10;
            tmp /= 10;
        }
        
        return x == reverse;
    }
}
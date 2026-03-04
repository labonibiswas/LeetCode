class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0; 
        int copy = x;
        if(x <0) return false;

        while(copy != 0){
            int rem = copy%10;
            rev = rev*10 + rem;
            copy /= 10;
        }

        return rev == x;
    }
}
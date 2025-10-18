class Solution {
    public boolean isPalindrome(int x) {
        int temp = 0, rev = 0;
        int copy = x;
        if( x < 0 || ( x % 10 == 0 && x != 0)){
            return false;
        }
        while( copy != 0){
            temp = copy % 10;
            rev = rev * 10 + temp;
            copy = copy / 10;
        }
        if(rev == x){
            return true;
        }

        return false;
    }
}
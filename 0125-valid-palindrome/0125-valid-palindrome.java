class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        int n = s.length();
        int l=0, r = n-1;
        while(l<=r){
            if(s.charAt(l) == s.charAt(r)){
                l++;r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
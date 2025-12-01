class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int st=0,end=0;
        for(int i=0; i<n; i++){
            int odd = expandcenter(s,i,i);
            int even = expandcenter(s,i,i+1);
            int maxLen = Math.max(odd,even);
            if(maxLen > end-st){
                st = i-(maxLen-1)/2;
                end = i + maxLen/2;
            }
        }
        return s.substring(st,end+1);
    }
    private int expandcenter(String s,int left ,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(s.length() > t.length()) return false;
        int ps = 0;
        for(int pt=0; pt< t.length(); pt++){
            if(s.charAt(ps) == t.charAt(pt)) ps++;
            if(ps == s.length()) return true;
        }
        return false;
    }
}
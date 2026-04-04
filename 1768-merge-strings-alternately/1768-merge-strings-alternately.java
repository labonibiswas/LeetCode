class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length() == 0) return word2;
        if(word2.length() == 0) return word1;
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder str = new StringBuilder();
        int l = Math.max(word1.length(), word2.length());
        for(int i=0; i<l; i++){
            if(n1 >0){
                str.append(word1.charAt(i));
                n1--;
            } 
            if(n2 >0){
                str.append(word2.charAt(i));
                n2--;
            } 
        }
        return str.toString();
    }
}
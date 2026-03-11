class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        
        StringBuilder word = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            word.append(str[i]);
            if( i != 0){
                word.append(" ");
            }
            
        }

        return word.toString();
    }
}
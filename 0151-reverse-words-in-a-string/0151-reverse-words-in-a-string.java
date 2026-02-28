class Solution {
    public String reverseWords(String s) {
     String[] word = s.trim().split("\\s+");
     StringBuilder str = new StringBuilder();
     int n= word.length;
     for(int i=n-1; i>=0; i--){
        str.append(word[i]);
        if(i != 0){
            str.append(" ");
        }
     }  
     return str.toString();
    }
}
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n;i++){
            int ascii = (int)s.charAt(i);
            if(ascii >=65 && ascii<=90){
                ascii += 32;
                char ch = (char)ascii;
                result.append(ch);
            }else{
                char ch = (char)ascii;
                result.append(ch);
            }
        }
        return result.toString(); 
    }
}
class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1; i>-1; i--){
            if(num.charAt(i) == '1' || num.charAt(i) == '3' || num.charAt(i) == '5' || num.charAt(i) == '7' || num.charAt(i) == '9'){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
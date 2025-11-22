class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1; i>-1; i--){
            char digit = num.charAt(i);
            if(digit == '1' || digit == '3' || digit == '5' || digit == '7' || digit == '9'){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
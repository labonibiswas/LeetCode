class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //if the digit is not returned by the above loop it means all the digits are 9
        //(eg. 99) in that case we need to increase the size of the array by 1.
        //where 1 will be the first element and other will be 0.
        //(for the above eg. it will be 100)
        int[] newdigits = new int[n+1];
        newdigits[0] = 1; //java bydefault asign other element to 0.
        return newdigits; 
    }
}
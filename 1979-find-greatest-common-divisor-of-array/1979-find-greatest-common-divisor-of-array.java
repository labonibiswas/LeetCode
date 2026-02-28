class Solution {
    public int gcd(int n1, int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        return n1;
    }
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for( int val : nums){
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        return gcd(max,min);
    }
}
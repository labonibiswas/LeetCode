class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum  = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int l = 0;
        int r=k;
        int maxSum = sum;
        while(r < nums.length){
            sum -= nums[l];
            l++;
            sum += nums[r];
            r++;
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum/k;
    }
}
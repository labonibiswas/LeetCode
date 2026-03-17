class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i]; 
        }
        int maxSum = sum;
        int sIdx = 0;
        int eIdx = k;
        while(eIdx < nums.length){
            sum -= nums[sIdx];
            sIdx++;
            sum += nums[eIdx];
            eIdx++;
            maxSum = Math.max(sum,maxSum);
        }
        return (double) maxSum/k;
    }
}
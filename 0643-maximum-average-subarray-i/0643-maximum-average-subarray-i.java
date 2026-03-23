class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //if(nums.length == 1) return nums[0];
        int sum = 0; 
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int l=0, r =k;
        int max = sum;
        while(r < nums.length){
            sum += nums[r];
            r++;
            sum -= nums[l];
            l++;
            max = Math.max(sum, max);
        }

        return (double)max/k;
    }
}
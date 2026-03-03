class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,res=0;
        int total =0;
        for(int r=0; r<nums.length; r++){
            total += nums[r];
            while((long) nums[r] * (r-l+1) - total > k){
                total -= nums[l++];
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
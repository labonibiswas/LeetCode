class Solution {
    public int findMin(int[] nums) {
        int ans = 0;
        int n = nums.length;
        if(nums[0] < nums[n-1] || n==1) return nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]) ans =  nums[i];
        }
        return ans;
    }
}
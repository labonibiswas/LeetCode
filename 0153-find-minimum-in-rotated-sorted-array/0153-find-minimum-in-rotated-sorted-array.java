class Solution {
    public int findMin(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int l = 0, r = nums.length;
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[l] <= nums[mid]){
                mini = Math.min(mini,nums[l]);
                l = mid + 1;
            }else{
                r = mid -1;
                mini = Math.min(nums[mid], nums[r]);
              
            }
        }
        return mini;
    }
}
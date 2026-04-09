class Solution {
    public int search(int[] nums, int target) {
        int l = 0; int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(nums[mid] == target) return mid;

            //sorted
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target < nums[mid]) r = mid-1; // if target is in sorted part
                else l = mid+1; // target is in unsorted part
            }
            //unsorted
            else{
                if(target > nums[mid] && target <= nums[r]) l = mid + 1;
                else r = mid-1;
            }
        }
        return -1;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l=0; 
        for(int r=0; r<n; r++){
            if(nums[r] != 0){
                if( r != l){
                    int temp = nums[r];
                    nums[r] = nums[l];
                    nums[l] = temp;
                }
                l++;
            }
        }
    }
}
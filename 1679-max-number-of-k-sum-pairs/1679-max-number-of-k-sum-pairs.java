class Solution {
    public int maxOperations(int[] nums, int k) {
        int l=0, r=nums.length-1;
        Arrays.sort(nums);
        int count = 0;
        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum == k){
                l++;
                r--;
                count++;
            }else if(sum > k){
                r--;
            }else{
                l++;
            }
        }

        return count;
    }
}
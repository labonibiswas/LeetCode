class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int sIdx = 0;
        int eIdx = nums.length-1;
        int count = 0;
        while(sIdx < eIdx){
            if(nums[sIdx] + nums[eIdx] == k){
                sIdx++;
                eIdx--;
                count++;
            }else if(nums[sIdx] + nums[eIdx] < k){
                sIdx++;
            }else{
                eIdx--;
            }
        }
        return count;
    }
}
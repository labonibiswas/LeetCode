class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            seen.put(nums[i],seen.getOrDefault(nums[i],0) + 1);
        }
        for(int i=0; i<nums.length; i++){
            if(seen.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return 0;
    }
}
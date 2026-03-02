class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                int res[] = {i, map.get(complement)};
                return res;
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
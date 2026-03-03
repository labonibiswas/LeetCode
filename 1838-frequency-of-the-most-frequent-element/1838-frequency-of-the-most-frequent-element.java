class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, res = 0;
        long total = 0;

        for (int r = 0; r < nums.length; r++) {
            total += nums[r];
            
            // While the cost to make all elements in window equal to nums[r] > k
            // Cost = (Number of elements * Target value) - Current Sum
            while ((long)nums[r] * (r - l + 1) - total > k) {
                total -= nums[l++];
            }
            
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
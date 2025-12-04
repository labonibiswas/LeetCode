class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, res=0;
        long total=0;
        int n= nums.length;
        
        for(int r=0; r<n; r++){
            total += nums[r];
            long windowLen = (r-l+1);
            long sum = windowLen * nums[r];
            long cost = sum - total;
            while(cost > k){
                total -= nums[l];
                l++;

                windowLen = (long)(r - l + 1);
                sum = windowLen * nums[r];
                cost = sum - total;
            }
            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
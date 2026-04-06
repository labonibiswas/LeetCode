class Solution {
    public int lowerBound(int[] arr,int n, int x){
        int l = 0; int r = n-1;
        int ans = n;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid] >= x){
                ans = mid;
                r = mid-1;
            }else l = mid + 1;
        }
        return ans;
    }
    public int upperBound(int[] arr,int n, int x){
        int l = 0; int r = n-1;
        int ans = n;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid] > x){
                ans = mid;
                r = mid-1;
            }else l = mid + 1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb = lowerBound(nums, n, target);
        if( lb == n || nums[lb] != target) return new int[] {-1,-1};
        return new int[] {lb, upperBound(nums, n, target) - 1};
    }
}
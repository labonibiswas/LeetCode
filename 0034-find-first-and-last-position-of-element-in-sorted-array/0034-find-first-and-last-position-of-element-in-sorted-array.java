class Solution {
    public int first(int[] arr,int n, int x){
        int l = 0; int r = n-1;
        int first = -1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x){
                first = mid;
                r = mid-1;
            }
            else if(arr[mid] < x ) l = mid + 1;
            else r = mid -1;
        }
        return first;
    }
    public int last(int[] arr,int n, int x){
        int l = 0; int r = n-1;
        int last = -1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x){
                last = mid;
                l = mid+1;
            }
            else if(arr[mid] < x ) l = mid + 1;
            else r = mid -1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first = first(nums, n, target);
        if(first == -1) return new int[] {-1,-1};
        int last = last(nums, n, target);
        return new int[] {first, last};
    }
}
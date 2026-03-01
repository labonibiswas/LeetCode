class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
    
        int n = nums.length;
        int s=0, m = 0, e = n-1;
        while(m<=e){
            switch(nums[m]){
                case 0:
                   swap(nums,s,m);
                   s++;
                   m++; 
                   break;
                case 1:
                   m++; 
                   break;
                case 2:
                   swap(nums,m,e);
                   e--;
                   break;
            }
        }
    }
}
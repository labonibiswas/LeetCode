class Solution {
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int s=0,m=0,e=nums.length-1;
        while(m<=e){
            switch(nums[m]){
                case 0:
                swap(nums,s,m);
                s++;m++;
                break;
                case 1:
                m++;
                break;
                case 2:
                swap(nums,e,m);
                e--;
                break;
            }
        }
    }
}
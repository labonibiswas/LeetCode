class Solution {
    private void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sortColors(int[] nums) {
        int s = 0, m = 0, e = nums.length-1;
        while(m <= e){
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
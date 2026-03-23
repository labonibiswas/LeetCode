class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2) return 0;
        int maxArea = 1;
        int l = 0; int r = height.length-1;
        while(l<r){
            int area = Math.min(height[l], height[r]) * (r-l);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
            maxArea = Math.max(area,maxArea);
        }

        return maxArea;
    }
}
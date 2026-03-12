class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for(int i=0; i<flowerbed.length; i++){
            boolean isLeftEmplty = (i == 0) || (flowerbed[i-1] ==0);

            Boolean isRightEmpty = (i == flowerbed.length-1) || (flowerbed[i+1] == 0);

            if(flowerbed[i] == 0){
                if(isLeftEmplty && isRightEmpty){
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }
}
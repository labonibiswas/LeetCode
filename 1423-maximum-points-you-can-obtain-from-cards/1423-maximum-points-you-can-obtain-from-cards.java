class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int lsum=0;
        int rsum=0;
        for(int i=0; i< k; i++){
            lsum += cardPoints[i];
            max = lsum;
        }
        int ridx = cardPoints.length-1;
        for(int i=k-1; i>=0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[ridx];
            ridx--;
            max = Math.max(max,lsum+rsum); 
        }
        return max;
    }
}
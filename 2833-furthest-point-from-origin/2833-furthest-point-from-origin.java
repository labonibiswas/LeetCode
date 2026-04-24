class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right=0, underscore = 0;
        int max = 0;
        for(int i=0; i <moves.length(); i++){
            if (moves.charAt(i) == 'L') left++;
            else if (moves.charAt(i) == 'R') right++;
            else underscore++;
        }

        max = Math.abs(left-right) + underscore;

        return max;
    }
}
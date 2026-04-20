class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;
        
        // Scenario 1: Measure from the very first house (index 0)
        // Scan right-to-left to find the furthest different color
        for (int i = n - 1; i > 0; i--) {
            if (colors[i] != colors[0]) {
                max = Math.max(max, i - 0);
                break; 
            }
        }
        
        // Scenario 2: Measure from the very last house (index n - 1)
        // Scan left-to-right to find the furthest different color
        for (int i = 0; i < n - 1; i++) {
            if (colors[i] != colors[n - 1]) {
                max = Math.max(max, (n - 1) - i);
                break;
            }
        }
        
        return max;
    }
}
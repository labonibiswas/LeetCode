class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFrequency = 0;
        int[] hash = new int[26];

        while (right < n) {
            hash[s.charAt(right) - 'A']++;
            
            maxFrequency = Math.max(maxFrequency, hash[s.charAt(right) - 'A']);

            if ((right - left + 1) - maxFrequency > k) {
                hash[s.charAt(left) - 'A']--;
                left++; 
            }
            if ((right - left + 1) - maxFrequency <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }

        return maxLen;
    }
}
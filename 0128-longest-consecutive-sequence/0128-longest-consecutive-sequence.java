class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLen = 0;
        Map<Integer,Boolean> exploreMap = new HashMap<>();
        for(int num : nums){
            exploreMap.put(num,Boolean.FALSE);
        }

        for(int num : nums){
            int currentLen = 1;

            int nextNum = num + 1;

            while(exploreMap.containsKey(nextNum) && exploreMap.get(nextNum) == false){
                currentLen++;
                exploreMap.put(nextNum,Boolean.TRUE);

                nextNum++;
            }

            int prevNum = num - 1;
            
            while(exploreMap.containsKey(prevNum) && !exploreMap.get(prevNum)){
                currentLen++;

                exploreMap.put(prevNum,Boolean.TRUE);
                prevNum--;
            }

            longestLen = Math.max(longestLen, currentLen);
        }
        return longestLen;
    }
}
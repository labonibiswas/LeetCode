class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int prefixSum = 0;
        map.put(0, 1);
        for(int n :nums){
            prefixSum += n;
            if(map.containsKey(prefixSum -k)) result += map.get(prefixSum-k); //if prefixsum exists add it in the result

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1); //if not then update the sum in the map
        }

        return result;
    }
}
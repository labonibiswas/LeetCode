class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new  HashMap<>();
        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0) +1 );
        }
        int l=nums.length;
        List<Integer> bucket[] = new List[l+1];
        for(int num : freqMap.keySet()){
            int freq = freqMap.get(num);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int result[] = new int[k];
        int count = 0;

        for(int i = bucket.length-1; i>=0 && count < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[count++] = num;
                }
            }
        }

        return result;
    }
}
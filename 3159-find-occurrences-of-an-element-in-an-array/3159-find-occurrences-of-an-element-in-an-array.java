class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int ans[] = new int[queries.length];
        
        List<Integer> count = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x) count.add(i);
        }       
        
        for(int i=0; i<queries.length; i++){
            if(queries[i] <= count.size()) ans[i] = count.get(queries[i] - 1);
            else ans[i] = -1;
        }

        return ans;
    }
}
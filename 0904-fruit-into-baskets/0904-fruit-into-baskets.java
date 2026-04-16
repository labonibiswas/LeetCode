class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int l=0, maxFruits=0;
        for(int r=0; r<fruits.length; r++){
            int currCount = basket.getOrDefault(fruits[r], 0);
            basket.put(fruits[r], currCount + 1);

            //if basket have more then 2 type of fruites
            //start emptying the basket
            while(basket.size() > 2){
                int fruitsCount = basket.get(fruits[l]);
                if(fruitsCount == 1){
                    basket.remove(fruits[l]);
                }else{
                    basket.put(fruits[l], fruitsCount -1);
                   
                }
                l++;
            }

            maxFruits = Math.max(maxFruits, r - l +1);
        }
        return maxFruits;
    }
}